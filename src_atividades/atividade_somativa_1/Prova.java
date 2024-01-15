package atividade_somativa_1;

public class Prova {

	public static void main(String[] args) {
		System.out.println(recursiva(5));
	}
	public static int recursiva(int valor) {
		if (valor == 1) {
			return valor;
		} else {
			return 2 + recursiva(valor - 1);
		}
	}
}
