package desafio_matriz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tamanho da matriz: ");
		int n = sc.nextInt();		
		int[][] matriz = new int [n][n];
		
		
		System.out.println("Informe o valor na matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("Linha: "+ i + " Coluna: "+j);				
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matriz diagonal: ");
		
		for(int i=0; i<n; i++) {
			System.out.print("Numeros:" + matriz[i][i] +", " );
		}
		
		System.out.println();
		
		int negativo = 0;
		
		System.out.println("Números negativos: ");
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[i].length; j++) {				
				if(matriz[i][j]<negativo) {
					negativo++;
				}
			}			
		}
		
		System.out.println("Quantidade de numeros negativos: " + negativo);
		
		System.out.println("Matriz completa:");
		
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}			
		}
		
		sc.close();

	}

}
