package estruturas;

public class Fila {
	int inicio;
	int fim;
	int[] fila;
	
	// Construtor
	public Fila() {
		inicio = -1;
		fim = -1;
		fila = new int[10];
	}
	
	// Verifica se a fila está vazia
	public boolean filaVazia() {
		if(this.inicio == -1 || this.fim == -1) {
			return true;
		}
		return false;
	}
	
	// Verifica se a fila está cheia
	public boolean filaCheia() {
		if(this.fim == this.fila.length -1) {
			return true;
		}
		return false;
	}
	
	// Remove elementos da fila
	public void remove() {
		if(filaVazia()) {
			System.out.println("Fila vazia!");
		} 	
		for(int i = 0; i < this.fim; i++) {
		
			this.fila[i] = this.fila[i+1];
		}
		fim--;
	}
	
	// Adiciona elementos à fila
	public void adiciona(int valor) {
		if(!filaCheia()) {	
			
			if(inicio == -1) {
				inicio = 0;
			}		
			this.fila[++this.fim] = valor;
		} 
	}
	
	// Imprime a fila
	public void mostraFila() {
		for(int i = 0; i <= fim; i++) {
			System.out.print(this.fila[i] + " <- ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Fila f = new Fila();
		
		f.adiciona(10);
		f.adiciona(20);
		f.adiciona(30);
		f.adiciona(40);
		f.mostraFila();
		
		f.remove();
		f.mostraFila();
		
	}
}