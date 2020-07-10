
public class Summe {
	public static void main (String[] args) {
		int a = IO.readInt("Bitte n festlegen:");
		wertAusrechnen(a);
	}
	public static void wertAusrechnen(int a) {
		int speicher = 0;		
		if (a <= 0) {
			rueckgabe();
		}
		else {
			for(int zaehler = 0;zaehler<a;zaehler++) {
				speicher = zaehler + speicher;			
			}
		}
		System.out.println(speicher);
		
	}
	static boolean rueckgabe() {
		return false;
	}
}

