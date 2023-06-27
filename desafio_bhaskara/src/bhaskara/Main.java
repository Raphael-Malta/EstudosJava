package bhaskara;
import java.util.Scanner;

import calculator.Calculate;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Informe valor de a");
		double a = sc.nextDouble();
		System.out.println("Informe valor de b");
		double b = sc.nextDouble();
		System.out.println("Informe valor de c");
		double c = sc.nextDouble();
		
		Calculate calcula = new Calculate(a,b,c);
		calcula.result(a, b, c);
		
		sc.close();
	}
}
