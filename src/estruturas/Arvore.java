package estruturas;

public class Arvore {

	private No raiz;

	public Arvore() {
		raiz = null;
	}

	public boolean arvoreVazia() {
		return raiz == null;
	}

	public void insere(Integer valor) {
		insere(raiz, valor);
	}

	public void insere(No no, Integer valor) {
		if (arvoreVazia()) {
			raiz = new No(valor);
		}

		// Se o novo nó for maior que nó atual insere à direita
		else if (valor >= no.getValor()) {
			if (no.getDireita() == null) {
				no.setDireita(new No(valor));
			} else {
				insere(no.getDireita(), valor);
			}
		}

		// Se o novo nó for maior que nó atual insere à esquerda
		else /* if(valor < no.getValor()) */ {
			if (no.getEsquerda() == null) {
				no.setEsquerda(new No(valor));
			} else {
				insere(no.getEsquerda(), valor);
			}
		}
	}

	// Método de pesquisa pré-ordem
	public void preOrdem() {
		preOrdem(raiz);
		System.out.println();
	}

	public void preOrdem(No no) {
		if (arvoreVazia()) {
			System.out.println("Árvore vazia!");
		} else if (no != null) {
			System.out.print(no.getValor() + "-> ");
			preOrdem(no.getEsquerda());
			preOrdem(no.getDireita());
		}
	}

	public void inOrdem() {
		inOrdem(raiz);
		System.out.println();
	}

	public void inOrdem(No no) {
		if (arvoreVazia()) {
			System.out.println("Árvore vazia!");
		}

		else if (no != null) {
			inOrdem(no.getEsquerda());
			System.out.print(no.getValor() + "-> ");
			inOrdem(no.getDireita());
		}
	}

	public void posOrdem() {
		posOrdem(raiz);
		System.out.println();
	}

	public void posOrdem(No no) {
		if (arvoreVazia()) {
			System.out.println("Árvore vazia!");
		} else if (no != null) {
			posOrdem(no.getEsquerda());
			posOrdem(no.getDireita());
			System.out.print(no.getValor() + "-> ");
		}
	}

	public No remove(Arvore arvore, Integer valor) {
		// No balancear = remove(arvore, raiz, valor, null);
		return remove(arvore, raiz, valor, null);
	}

	public No remove(Arvore arvore, No no, Integer valor, No pai) {

		if (no != null) {

			if (no.getValor() == valor) {

				if (no.getEsquerda() == null && no.getDireita() == null) { // Não possui filhos

					if (pai == null) {
						arvore.raiz = null;
					} else if (no.getValor() >= pai.getValor()) {
						pai.setDireita(null);
						return no;
					} else {
						pai.setEsquerda(null);
						return no;
					}
				}

				else if (no.getEsquerda() == null) { // Possui somente filhos à direita

					if (no.getValor() >= pai.getValor()) {
						pai.setDireita(no.getDireita());
					} else {
						pai.setEsquerda(no.getDireita());
					}
					no.setDireita(null);
				}

				else if (no.getDireita() == null) { // Possui somente filhos à esquerda

					if (no.getValor() >= pai.getValor()) {
						pai.setDireita(no.getEsquerda());
					} else {
						pai.setEsquerda(no.getEsquerda());
					}
					no.setEsquerda(null);
				}

				else { // Possui filhos à esquerda e à direita
					int maior = maiorEsquerda(no).getValor();
					int noRemanejado = remove(arvore, maior).getValor();
					no.setValor(noRemanejado);

					return no;
				}
			} else if (valor >= no.getValor()) {
				return remove(arvore, no.getDireita(), valor, no);
			} else {
				return remove(arvore, no.getEsquerda(), valor, no);
			}
		} else {
			System.out.println("# Falha na remoção!");
			System.out.println("# Nó " + valor + " não existe!");
		}
		return null;
	}

	private No maiorEsquerda(No no) {

		if (no.getEsquerda() != null) {

			no = no.getEsquerda();

			while (no.getDireita() != null) {
				no = no.getDireita();
			}
		}
		return no;
	}

	private No busca(Integer valor) {
		return busca(raiz, valor);
	}

	private No busca(No no, Integer valor) {
		if (no != null) {
			if(no.getValor() == valor) {
				System.out.println("# Nó " + valor + " encontrado!");
				return no;
			} else if (valor >= no.getValor()) {
				return busca(no.getDireita(), valor);
			} else {
				return busca(no.getEsquerda(), valor);
			}
		}
		System.out.println("# Nó " + valor + " não encontrado!");
		return null;
	}

	public static void main(String[] args) {
		Arvore a = new Arvore();
		a.insere(20); // Raiz
		
		a.insere(25);
		a.insere(10);
		a.insere(15);

		a.insere(30);
		a.insere(23);
		a.insere(24);
		a.insere(35);

		a.preOrdem();
		a.inOrdem();
		a.posOrdem();
		System.out.println();
		
		a.remove(a, 11);
		//a.preOrdem();
		a.busca(20);
	}
}