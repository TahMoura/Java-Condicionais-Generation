package Condicionais_Switch;

import java.util.Scanner;

public class Produtos {

	public static void main(String[] args) {
		
		int op, quantidade; float total;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem-Vindo! Selecione uma opção:\n****************************************");
		
		System.out.println("1- Cachorro-Quente - R$10,00\n2- X-Salada - R$15,00\n3- X-Bacon - R$18,00\n4- Bauru - R$12,00\n5- Refrigerante - R$8,00\n6- Suco de Laranja - R$13,00\n****************************************");
		System.out.print("\nDigite sua Opção: ");
		op = scan.nextInt();
		
		switch(op) {
		case 1:
			System.out.print("Você escolheu: Cachorro-Quente.\nQual a quantidade? ");
			quantidade = scan.nextInt();
			total = 10 * quantidade;
			System.out.printf("O valor total da sua compra é: %.2f", total);
			break;
			
		case 2:
			System.out.print("Você escolheu: X-Salada.\nQual a quantidade? ");
			quantidade = scan.nextInt();
			total = 15 * quantidade;
			System.out.printf("O valor total da sua compra é: %.2f", total);
			break;
			
		case 3:
			System.out.print("Você escolheu: X-Bacon.\nQual a quantidade? ");
			quantidade = scan.nextInt();
			total = 18 * quantidade;
			System.out.printf("O valor total da sua compra é: %.2f", total);
			break;
			
		case 4:
			System.out.print("Você escolheu: Bauru.\nQual a quantidade? ");
			quantidade = scan.nextInt();
			total = 12 * quantidade;
			System.out.printf("O valor total da sua compra é: %.2f", total);
			break;
			
		case 5:
			System.out.print("Você escolheu: Refrigerante.\nQual a quantidade? ");
			quantidade = scan.nextInt();
			total = 8 * quantidade;
			System.out.printf("O valor total da sua compra é: %.2f", total);
			break;
			
		case 6:
			System.out.print("Você escolheu: Suco de Laranja.\nQual a quantidade? ");
			quantidade = scan.nextInt();
			total = 13 * quantidade;
			System.out.printf("O valor total da sua compra é: %.2f", total);
			break;
			
			default: 
				System.out.println("Opção Inválida! Tente Novamente.");
		
		}
	}

}
