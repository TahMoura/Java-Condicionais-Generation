package Condicionais_Switch;

import java.util.Scanner;

public class Reajuste {

	public static void main(String[] args) {
		
		String nome; 
		float salario, novoSalario;
		int op;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem-Vindo ao sistema de Cálculo de Reajuste de Salário!");
		
		System.out.print("Por favor, digite seu nome: ");
		nome = scan.nextLine();
		
		System.out.println("***************************************************\nOlá "+ nome+ "!\n\nAgora, selecione a Opção que corresponde ao seu cargo:");
		System.out.println("1- Gerente - Percentual de Reajuste: 10%\n2- Vendedor - Percentual de Reajuste: 7%\n3- Supervisor - Percentual de Reajuste: 9%\n4- Motorista - Percentual de Reajuste 6%\n5- Estoquista - Percentual de Reajuste: 5%\n6- Técnico de TI - Percentual de Reajuste: 8%");
		System.out.print("\nDigite a Opção: ");
		op = scan.nextInt();
		
		switch(op) {
		case 1: 
			System.out.print("Qual o seu salário atual? ");
			salario = scan.nextFloat();
			novoSalario = salario + (salario/100) * 10;
			System.out.println("*********************************\nNome do Colaborador: "+ nome);
			System.out.println("Cargo: Gerente");
			System.out.printf("Seu novo Salário com o Reajuste é: R$%.2f", novoSalario);
			break;
			
		case 2: 
			System.out.print("Qual o seu salário atual? ");
			salario = scan.nextFloat();
			novoSalario = salario + (salario/100) * 7;
			System.out.println("*********************************\nNome do Colaborador: "+ nome);
			System.out.println("Cargo: Vendedor");
			System.out.printf("Seu novo Salário com o Reajuste é: R$%.2f", novoSalario);
			break;
			
		case 3: 
			System.out.print("Qual o seu salário atual? ");
			salario = scan.nextFloat();
			novoSalario = salario + (salario/100) * 9;
			System.out.println("*********************************\nNome do Colaborador: "+ nome);
			System.out.println("Cargo: Supervisor");
			System.out.printf("Seu novo Salário com o Reajuste é: R$%.2f", novoSalario);
			break;
			
		case 4: 
			System.out.print("Qual o seu salário atual? ");
			salario = scan.nextFloat();
			novoSalario = salario + (salario/100) * 6;
			System.out.println("*********************************\nNome do Colaborador: "+ nome);
			System.out.println("Cargo: Motorista");
			System.out.printf("Seu novo Salário com o Reajuste é: R$%.2f", novoSalario);
			break;
			
		case 5: 
			System.out.print("Qual o seu salário atual? ");
			salario = scan.nextFloat();
			novoSalario = salario + (salario/100) * 5;
			System.out.println("*********************************\nNome do Colaborador: "+ nome);
			System.out.println("Cargo: Estoquista");
			System.out.printf("Seu novo Salário com o Reajuste é: R$%.2f", novoSalario);
			break;
			
		case 6: 
			System.out.print("Qual o seu salário atual? ");
			salario = scan.nextFloat();
			novoSalario = salario + (salario/100) * 8;
			System.out.println("*********************************\nNome do Colaborador: "+ nome);
			System.out.println("Cargo: Técnico de TI");
			System.out.printf("Seu novo Salário com o Reajuste é: R$%.2f", novoSalario);
			break;
			
			default:
				System.out.println("Opção Inválida! Tente Novamente.");
		}
	}

}
