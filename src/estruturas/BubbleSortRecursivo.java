package estruturas;

public class BubbleSortRecursivo {

	public static void main(String[] args) {
		int[] vetor = { 2, 4, 1, 3 };
		ordenar(vetor);
	}

	private static void ordenar(int[] vetor) {

		int comprimento = vetor.length;
		int num = comprimento;
		ordenar(vetor, num, comprimento);
	}

	private static void ordenar(int[] vetor, int num, int comprimento) {

		if (num == 1) {

			// Imprime vetor ordenado com BubbleSort
			System.out.print("Vetor com BubbleSort: ");
			for (int i = 0; i < comprimento; i++) {
				System.out.print(vetor[i] + " ");
			}

		} else {

			for (int i = 0; i < comprimento - 1; i++) {

				if (vetor[i] > vetor[i + 1]) {
					int numAux = vetor[i + 1];
					vetor[i + 1] = vetor[i];
					vetor[i] = numAux;
				}

			}
			ordenar(vetor, num - 1, comprimento);
		}
	}
}