package unico;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		final int nPar = 2;
		final int nDiv = 5;
		
		int num;
		String par;
		String div;

		System.out.print("Introduzca un número: ");
		num = Integer.parseInt(teclado.nextLine());
		
		if (num % nPar == 0) {
			par = "es par";
		} else {
			par = "es impar";
		}
		
		if (num % nDiv == 0) {
			div = "es divisible entre 5";
		} else {
			div = "no es divisible entre 5";
		}

		System.out.println("El número " + num + " " + par + " y " + div);
	}
}