
public class Aufgabe_2k {
	public static void main(String[] args) {
		summeUndDifferenzBilden();
	}

	static void summeUndDifferenzBilden() {
		int array[] = new int[2];
		int eingabe1 = IO.readInt();
		int eingabe2 = IO.readInt();
		int ergebnisDifferenz;
		if (eingabe1 > eingabe2) {
			ergebnisDifferenz = eingabe1 - eingabe2;
		} else {
			ergebnisDifferenz = eingabe2 - eingabe1;
		}
		array[0] = ergebnisDifferenz;
		array[1] = eingabe1 + eingabe2;
		System.out.println(array[0] + " " + array[1]);

	}
}