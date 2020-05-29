package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeFuncionario;
		int horasTrabalhadas;
		double valorHora;
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
		
		System.out.print("Valor por hora: ");
		valorHora = sc.nextDouble();
		if (valorHora <= 0) {
			System.out.print("Digite um valor positivo para o valor da hora trabalhada: ");
			valorHora = sc.nextDouble();
		}
		
		System.out.print("Digitar outro (S/N)? ");
		again = sc.next().charAt(0);
		} while(again != 'N' && again != 'n'); 
		
		sc.close();
	}

}
