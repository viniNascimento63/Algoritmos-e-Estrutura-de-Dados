package estruturas;

public class Pilha {

	public int[] pilha;
	public int topo;
	
	// Método construtor
	public Pilha() {
		this.pilha = new int[10];
		this.topo = -1;
	}
	
	// Método para verificar pilha vazia
	public boolean pilhaVazia() {
		if(this.topo != -1) {
			return false;
		}
		return true;
	}
	
	// Método para verificar pilha cheia
	public boolean pilhaCheia() {
		if(this.topo == this.pilha.length - 1) {
			return true;
		} 
		return false;
	}
	
	// Método para empilhamento
	public void empilha(int valor) {	
		// this.topo++;
		this.pilha[++this.topo] = valor;
	}
	
	// Método para desempilhar
	public void desempilha() {
		System.out.printf("\nElemento %d removido!\n", 
				this.pilha[this.topo]);
		this.pilha[topo--] = 0;
		//topo--;
	}
	
	// Método para mostrar a pilha no console
 	public void mostraPilha() {
		for(int i = this.pilha.length -1; i >= 0; i--) {
			if(this.pilha[i] != 0) {
				System.out.println("|" + this.pilha[i] + "|");	
			}
		}
	}
 	
	public static void main(String[] args) {
		Pilha p = new Pilha();
		
		p.empilha(1);
		p.empilha(2);

		p.mostraPilha();
		
		if(p.pilhaVazia()) {
			System.out.println("Pilha vazia!");
		} else {
			System.out.println("Pilha não vazia!");
		}
		
		if(p.pilhaCheia()) {
			System.out.println("Pilha cheia!");
		} else {
			System.out.println("Pilha não cheia!");
		}
	}
}
