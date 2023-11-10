package Condicionais_If;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		int a, b, c, soma;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Verificando se a Soma de A + B é maior, menor ou igual a C.\n******************************");
		
		System.out.print("Digite o valor de A: ");
		a = scan.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b = scan.nextInt();
		
		System.out.print("Digite o valor de C: ");
		c = scan.nextInt();
		
		soma = a + b;
		
		if(soma > c) {
			System.out.println(a + " + " + b + " = " + soma + " > " + c + "\nA soma de A + B é maior que C!" );
		}
		else if(soma < c) {
			System.out.println(a + " + " + b + " = " + soma + " < " + c + "\nA soma de A + B é menor que C!");
		}
		else if(soma == c) {
			System.out.println(a + " + " + b + " = " + soma + " = " + c + "\nA soma de A + B é igual a C!");
		}
	}	

}
