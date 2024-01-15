package estruturas;

import javax.swing.JOptionPane;

public class FibonacciRecursivo {

	public static int fibonacci(int i) {
		
		if(i == 0) {
			return 0;
		} else if(i == 1 || i == 2) {
			return 1;
		} else {
			return (fibonacci(i - 1) + fibonacci(i - 2));
		}
		
	}
	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.
				showInputDialog("Até qual elemento de Fibonacci?"));
		
		for(int i = 0; i <= num; i++) {		
			System.out.print(fibonacci(i) + ", ");
		}	
		
		System.out.println("Continua...");
	}
}
