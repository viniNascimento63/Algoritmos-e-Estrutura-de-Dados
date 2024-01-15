package estruturas;

public class Vetor {

	public static void main(String[] args) {		
	
		// Declaração indireta do vetor e seus elementos
		int[] vetor1 = new int[4];
		vetor1[0] = 4;
		vetor1[1] = 2;
		vetor1[2] = 6;
		vetor1[3] = 7;
		
		// Imprimindo na tela os valores de vetor 1
		for(int i = 0; i < vetor1.length; i++) {
			System.out.print(vetor1[i] + ", ");
		}
		
		System.out.println();
		
		// Declaração direta do vetor e seus elementos
		int[] vetor2 = {10, 15, 12, 19}; 
		
		// Imprimindo na tela os valores de vetor 2
		for(int i = 0; i < vetor2.length; i++) {
			System.out.print(vetor2[i] + ", ");
		}
	}
}
