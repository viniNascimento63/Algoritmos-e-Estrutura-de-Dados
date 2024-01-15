package estruturas;

public class Matriz {

	public static void main(String[] args) {
		
		// Declarando os elementos da matriz diretamente
		int[][] matriz1 = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		// Imprimindo os valores da matriz1
		for(int linha = 0; linha < matriz1.length; linha++) {
			for(int coluna = 0; coluna < matriz1[linha].length; coluna++) {
				System.out.print(matriz1[linha][coluna]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Declarando os elementos da matriz indiretamente
		int[][] matriz2 = new int[3][3];
		matriz2[0][0] = 1;
		matriz2[0][1] = 1;
		matriz2[0][2] = 1;
		matriz2[1][0] = 1;
		matriz2[1][1] = 1;
		matriz2[1][2] = 1;
		matriz2[2][0] = 1;
		matriz2[2][1] = 1;
		matriz2[2][2] = 1;
		
		// Imprimindo os valores da matriz1
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz1[i].length; j++) {
				System.out.print(matriz1[i][j]);
			}
			System.out.println();
		}
	}
}
