
public class Fibonacci {
	public static void main(String []args){
		double a = IO.readDouble("Wert a eingeben:");
		double b = IO.readDouble("Wert b eingeben:");
		double c = b;
		b = a;
		a = c;
		System.out.println("Wert a: " + a + ", Wert b: " + b);
	}
}
