package Ejemplo1;

import java.util.Scanner;

public class HolaPersona {

	public static void main(String[] args) {

		Scanner as = new Scanner(System.in);
		String nombre;
		System.out.println("Introduce tu nombre");
		nombre = as.next();
		System.out.println(nombre+"Eres un makina");
		as.close();
	}

}
