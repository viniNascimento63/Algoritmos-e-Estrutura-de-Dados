package estruturas;

public class FatorialRecursivo {
	
	private static int imprimeFatorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		return n * imprimeFatorial(n - 1);
	}
	
	public static void main(String[] args) {
		System.out.println("Fatorial é: " + imprimeFatorial(5));
	}
}
