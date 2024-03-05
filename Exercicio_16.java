package lista_01;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite sua renda:  ");
		double renda = scan.nextDouble();
		double imposto;
		scan.nextLine();		
		
		if(renda <= 2000.00) {
			System.out.print("Isento de imposto!");
		}
		else if (renda >= 2000.01 && renda <= 3000.00) {
			imposto = (renda)*0.08;
			System.out.printf("Imposto a ser pago: R$ %.2f", imposto);
		}
		else if(renda >= 3000.01 && renda <= 4500.00) {
			imposto = (renda)*0.18;
			System.out.printf("Imposto a ser pago: R$ %.2f", imposto);
		}
		else if(renda >= 4500.01) {
			imposto = (renda)*0.28;
			System.out.printf("Imposto a ser pago: R$ %.2f", imposto);
		}
		else {
			System.out.println("Erro! Verifique o valor digitado.");
		}
		
		scan.close();

	}

}

