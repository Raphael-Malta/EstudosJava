package desafio_vetor;

import java.util.Locale;
import java.util.Scanner;

import entites.Rent;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe quantos quartos existem: ");
		int x = sc.nextInt();

		Rent[] quartosA = new Rent[10];
		System.out.print("Quantos quartos foram alugados? ");
		int numQuarto = sc.nextInt();
		if (numQuarto < quartosA.length) {
			// Caso onde não pode começar com 0 pos mostro o valor de I
			for (int i = 1; i <= numQuarto; i++) {
				System.out.println("Rent #" + i + ":");
				System.out.print("Name:");
				// Limpar a memoria para não vir com conteudo indesejado
				// Usar nextLine pois pode ter espaço no texto
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.next();
				System.out.print("Room: ");

				int nQuarto = sc.nextInt() - 1;
				if (quartosA[nQuarto] == null) {

					Rent aluguel = new Rent(nome, email);
					quartosA[nQuarto] = aluguel;
				} else {
					System.out.println("Quarto já está ocupado");
				}
			}
			System.out.println("Busy rooms: ");
			for (int i = 0; i < 10; i++) {
				if (quartosA[i] != null) {
					System.out.println(i + 1 + ": " + quartosA[i]);
				}
			}

			sc.close();
		} else {
			System.out.println("Esse valor ultrapassa o limite de quartos que temos!");
		}
	}

}
