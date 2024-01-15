package estruturas;

// Nó de lista dinâmica
public class NoLista {
	private Integer informacao;
	private NoLista proximo;
	
	// Construtor
	public NoLista() {
		informacao = null;
		proximo = null;
	}
	
	public void setInfo(Integer informacao) {
		this.informacao = informacao;
	}
	
	public void setProx(NoLista proximo) {
		this.proximo = proximo;
	}
	
	public NoLista getProx() {
		return this.proximo;
	}
	
	public Integer getInfo() {
		return this.informacao;
	}
}
