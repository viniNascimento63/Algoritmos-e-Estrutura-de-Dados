package estruturas;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] vetor = { 2, 4, 1, 3 };
		ordenar(vetor);
	}
	
	private static void ordenar(int[] vetor) {
		
		int comprimento = vetor.length;
		
		// Imprime o vetor sem ordenação
		System.out.print("Vetor sem ordenação: ");
		for (int i = 0; i < comprimento; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		// Ordena os elementos
		for (int i = 0; i < comprimento; i++) {
			for (int j = 0; j < comprimento - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int numAux = vetor[j + 1];
					vetor[j + 1] = vetor[j];
					vetor[j] = numAux;
				}
			}
		}
		
		// Imprime o vetor ordenado com BubbleSort
		System.out.print("\nVetor com BubbleSort: ");
		for (int i = 0; i < comprimento; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
