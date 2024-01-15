package estruturas;

public class Lista {
	private NoLista primeiro;
	
	// Construtor
	public Lista() {
		primeiro = null;
	}
	
	// Verifica se a lista está vazia
	public boolean vazia() {
		return primeiro == null;
	}
	
	// Verifica se a lista possui determinado nó
	public boolean noExiste(int n) {
		
		NoLista auxiliar = primeiro;
		NoLista no  = new NoLista();
		no.setInfo(n);

		if(vazia()) {
			return false;
		} else {
			while(true) {
				if(auxiliar.getInfo() == no.getInfo()) {
					return true;
				} else if(auxiliar.getProx() == null) {
					break;
				} else {
					auxiliar = auxiliar.getProx();
				}
			}
		}
		System.out.println("\nNÓ " + n + " NÃO EXISTE!\n");
		return false;
	}
	
	// Insere novo nó na primeira posição
	public void inserePrimeiro(int info) {
		NoLista auxiliar = new NoLista();
		auxiliar.setInfo(info);
		auxiliar.setProx(primeiro);
		primeiro = auxiliar;
	}
	
	// Insere novo nó após outro específico
	public void insereDepois(NoLista no, int info) {
		NoLista auxiliar = primeiro;
		
		while(auxiliar.getInfo() != no.getInfo()) {
			auxiliar = auxiliar.getProx();
		}
		
		no.setInfo(info);
		no.setProx(auxiliar.getProx());
		auxiliar.setProx(no);
	}
	
	// Insere novo nó na última posição
	public void insereUltimo(int info) {
		if(vazia()) {
			inserePrimeiro(info);
		} else {
			NoLista auxiliar = primeiro;
			
			while(auxiliar.getProx() != null) {
				auxiliar = auxiliar.getProx();
			}
	
			NoLista novo = new NoLista();
			novo.setInfo(info);
			auxiliar.setProx(novo);
		}
	}
	
	// Remove primeiro nó da lista
	public NoLista removePrimeiro() {
		NoLista auxiliar = primeiro;
		if(vazia()) {
			System.out.println("Operação IMPOSSÍVEL!");
		} else {
			System.out.println("\n" + primeiro.getInfo() + " removido!");
			primeiro = primeiro.getProx();
		}
		return auxiliar;
	}
	
	// Remove último nó da lista
	public NoLista removeUltimo() {
		
		if(vazia()) {
			System.out.println("Operação IMPOSSÍVEL!");
			return null;
		} else if(primeiro.getProx() == null) {
			removePrimeiro();
			return primeiro;
		} else {	
			NoLista ultimo = new NoLista();
			NoLista auxiliar = primeiro;
			while(auxiliar.getProx() != null) {
				ultimo = auxiliar;
				auxiliar = auxiliar.getProx();					
			}
			ultimo.setProx(auxiliar.getProx());
			System.out.println("\n" + auxiliar.getInfo() + " removido!");
			return auxiliar;
		}
	}

	// Remove um nó específico da lista
	public NoLista remove(NoLista no) {
		
		if(no.getInfo() == primeiro.getInfo()) {
			removePrimeiro();
		} else {
			NoLista auxiliar = primeiro;
			NoLista anterior = new NoLista();
			
			while(auxiliar.getInfo() != no.getInfo()) {
				anterior = auxiliar;
				auxiliar = auxiliar.getProx();
			}
			
			anterior.setProx(auxiliar.getProx());
			System.out.println("\n" + no.getInfo() + " removido!");
		}
		return no;
	}
	
	// Imprime lista no console
	public void mostraLista() {
		NoLista auxiliar = primeiro;
		if(vazia()) {
			System.out.println("Lista VAZIA!");
		}
		while(auxiliar != null) {
			System.out.print(auxiliar.getInfo() + ", ");
			auxiliar = auxiliar.getProx();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Lista l = new Lista();
		
		l.inserePrimeiro(10);
		l.insereUltimo(20);
		l.inserePrimeiro(30);
		l.insereUltimo(40);
		l.insereUltimo(50);
		l.mostraLista();
		
		
		if(l.noExiste(10)) {
			NoLista no = new NoLista();
			no.setInfo(10);
			l.insereDepois(no, 13);
			l.mostraLista();
		}	
		
		l.removePrimeiro();
		l.mostraLista();
		
		l.removeUltimo();
		l.mostraLista();
		
		l.insereUltimo(44);
		l.mostraLista();
		
		
		if(l.noExiste(13)) {
			NoLista no = new NoLista();
			no.setInfo(13);
			l.remove(no);
			l.mostraLista();
		}	
	}
}