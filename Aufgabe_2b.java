
public class Aufgabe_2b {
	static double x = IO.readDouble();
	static double y = IO.readDouble();

	public static void main(String[] args) {
		vertauschteZahlenAusgeben();
	}

	static double[] vertauschen(double a, double b) {
		double[] vertauschteZahlen = new double[2];
		double c = a;
		a = b;
		b = c;
		vertauschteZahlen[0] = a;
		vertauschteZahlen[1] = b;
		return vertauschteZahlen;
	}
	static void vertauschteZahlenAusgeben() {
		double[] vertauschteZahlen = vertauschen(x,y);
		for(int i = 0; i<vertauschteZahlen.length; i++){
			System.out.println(vertauschteZahlen[i]);
		}
	}
}