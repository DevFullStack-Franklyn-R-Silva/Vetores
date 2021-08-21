package application;

import java.util.Locale;
import java.util.Scanner;

public class TESTE {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[10];
		
		int cont = 0;
		vetor[0] = 100;
		vetor[6] = 145640;
		vetor[5] = 5500;
		vetor[9] = 1055;
		for(int n : vetor) {
			System.out.println(cont+++" linha. Tem o "+ n);
		}
		System.out.println(vetor[5]);
		sc.close();
	}

}
