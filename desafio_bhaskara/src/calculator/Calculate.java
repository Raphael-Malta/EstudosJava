package calculator;

public class Calculate {

	private double a, b, c;

	public Calculate(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void result(double a, double b, double c) {
		double delta = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
		if (delta > 0) {
			double x1 = (-b + delta) / (2 * a);
			double x2 = (-b - delta) / (2 * a);
			System.out.println("O valor de x1 é: " + x1 + ", e o valor de x2 é: " + x2);
		} else if (delta == 0) {
			double x = -b / (2 * a);
			System.out.println("A equação possui uma raiz real: x = " + x);
		} else {
			System.out.println("Delta deu negativo, impossível fazer operação!");
		}
	}

}
