package estruturas;

public class SelectionSort {

	public static void main(String[] args) {
		int[] vetor = { 2, 3, 1, 4, 8, 5, 10, 7 };
		ordenar(vetor);
	}
	
	private static void ordenar(int[] vetor) {
		
		int comprimento = vetor.length;
		
		// Imprime vetor sem ordenação
		System.out.print("Vetor não ordenado: ");
		for (int i = 0; i < comprimento; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		for (int i = 0; i < comprimento; i++) {
			for (int j = i + 1; j < comprimento; j++) {
				if (vetor[i] > vetor[j]) {
					int numAux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = numAux;
				}
			}
		}
		
		// Imprime vetor com ordenação SelectionSort
		System.out.print("\nVetor com SelectionSort: ");
		for (int i = 0; i < comprimento; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
