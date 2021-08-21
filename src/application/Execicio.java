package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quarto;

public class Execicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Quarto[] vetor = new Quarto[10];

		System.out.println("Quantos quartos?");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Aluguel #" + i + ": ");
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			
			
			for(int j= 0;j<10;j++) {
				
			}

			vetor[quarto] = new Quarto(nome, email);
			
		}
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}

		sc.close();
	}

}
