package estruturas;

import java.util.Scanner;

public class SomaRecursiva {
	
	private static int soma(int n) {
		
		if(n == 0)
			return 0;
		
		return n + soma(n - 1);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número para a soma: ");
		int num = scanner.nextInt();
		
		for(int i = 0; i <= num; i++) {
			System.out.println("A soma é: " + soma(i));
		}
		
		scanner.close();
	}
}
