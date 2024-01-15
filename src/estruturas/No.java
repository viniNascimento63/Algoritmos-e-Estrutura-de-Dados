package estruturas;

public class No {
	
	private int valor;
	private No esquerda;
	private No direita;
	
	// Construtor
	public No(int valor) {
		this.valor = valor;
	}
	
	public Integer getValor() {
		return this.valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public No getEsquerda() {
		return this.esquerda;
	}
	
	public void setEsquerda(No no) {
		this.esquerda = no;
	}
	
	public No getDireita() {
		return this.direita;
	}
	
	public void setDireita(No no) {
		this.direita = no;
	}
}
