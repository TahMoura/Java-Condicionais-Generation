package Condicionais_If;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Verificando se um número é Par ou Ímpar e se é positivo ou negativo.\n*************************************");
		
		System.out.print("Digite um número: ");
		num = scan.nextInt();
		
		if(num % 2 == 0 && num >=0) {
			System.out.println("O número é Par e Positivo!");
		}
		else if(num % 2 == 0 && num < 0) {
			System.out.println("O número é par e Negativo!");
		}
		else if(num % 2 != 0 && num >= 0) {
			System.out.println("O número é Ímpar e Positivo!");
		}
		else {
			System.out.println("O número é Ímpar e negativo!");
		}

	}

}
