
public class floatWerte {
	public static void main (String[]args) {
		int a = IO.readInt("Bitte Anzahl zu übergebener Float Werte eingeben:");
		flSumme(a);
	}
	public static void flSumme(int a) {
		float speicher = 0;
		for(int zaehler = 0; zaehler <a; zaehler++) {
			float b = IO.readFloat();
			speicher = b + speicher;
		}
		System.out.println(speicher);
	}
}
