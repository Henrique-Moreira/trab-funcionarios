package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeFuncionario;
		int horasTrabalhadas, option, totalHoras = 0;
		double valorHora, totalPagamento = 0;
		char again;
		
		do {
		System.out.print("Nome:");
		nomeFuncionario = sc.next();
		
		System.out.print("Horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		if (horasTrabalhadas <= 0) {
			System.out.print("Digite um valor positivo para as horas trabalhadas: ");
			horasTrabalhadas = sc.nextInt();
		}
		totalHoras = totalHoras + horasTrabalhadas;
		
		System.out.print("Valor por hora: ");
		valorHora = sc.nextDouble();
		if (valorHora <= 0) {
			System.out.print("Digite um valor positivo para o valor da hora trabalhada: ");
			valorHora = sc.nextDouble();
		}
		totalPagamento = totalPagamento + horasTrabalhadas*valorHora;
		
		System.out.print("Digitar outro (S/N)? ");
		again = sc.next().charAt(0);
		} while(again != 'N' && again != 'n'); 

		
		do {
		System.out.println();
		System.out.println("MENU");
		System.out.println("1 - Total de horas trabalhadas");
		System.out.println("2 - Custo total");
		System.out.println("3 - Nome da pessoa que ganhou mais");
		System.out.println("4 - Sair");
		System.out.print("Digite uma opção: ");
		option = sc.nextInt();
		
		if (option == 1) {
			System.out.println();
			System.out.println("Total de horas: " + totalHoras);
		}
		else if (option == 2) {
			System.out.println();
			System.out.println("Custo total: R$" + totalPagamento);
		}
		} while (option != 4);
		
		sc.close();
	}

}
