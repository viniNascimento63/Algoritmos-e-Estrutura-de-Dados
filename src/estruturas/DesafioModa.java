package estruturas;

/* !!ATENÇÃO!!
 * O problema deste código é que ele não é genérico,
 * ou seja, todos os esforços para construí-lo visam
 * atingir um resultado específico já conhecido.
 * 
 * Por exemplo, se a sequência de valores for outra,
 * o valor sugerido como moda no final pode não estar
 * correto.
 * 
 * Abaixo do bloco comentado está a resolução.
 */

public class DesafioModa {

	public static void main(String[] args) {
		/*
		int[] dados = {1, 5, 2, 3, 1, 3, 1};
		int frequencia = 0;
		int elemento = 0;
		// Dicionário de elementos
		Map<Integer, Integer> elementos = new HashMap<>();
		
		// Varre a lista identificando os elementos
		for(int i = 0; i < dados.length; i++) {
			frequencia = 0;
			elemento = dados[i];			
			
			// Varre a lista identificando a frequência do elemento
			for(int j = 0; j < dados.length; j++) {
				if(elemento == dados[j]) {
					frequencia += 1;
				}
			}			
			elementos.put(elemento, frequencia);
		}
		int moda = 0;
		int freq = 0;
		// Definirá a moda de acordo com o maior valor do dicionário
		for(int key : elementos.keySet()) {
			int chave = key;
			
			for(int v : elementos.values()) {
				if(freq < v) {
					freq = v;
					moda = chave;					
				}
			}
		}
		
		System.out.println("Elementos identificados: " + elementos.keySet());
		System.out.println("Frequências respectivas: " + elementos.values());
		System.out.printf("\nPortanto, a moda é igual a %d.", moda);
		*/
		
		// RESOLUÇÃO
		int frequencia;
		int freqNumAnterior = 0;
		int moda = 0;
		int[] vetor = {1, 5, 2, 3, 1, 3, 1};
		
		for(int i = 0; i < vetor.length; i++) {
			frequencia = 0;
			
			for(int j = 0; j < vetor.length; j++) {
				if(vetor[i] == vetor[j]) {
					frequencia++;
				}
			}
			
			if(frequencia > freqNumAnterior) {
				moda = vetor[i];
				freqNumAnterior = frequencia;
			}
		}
		System.out.println("Moda: " + moda);
	}
}
