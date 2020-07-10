
public class Auswahl {
	public static void main (String [] args) {
		System.out.println("Summe von float Werten = 1");
		System.out.println("Kleineren Primzahlen = 2");
		System.out.println("Zahlen Runden = 3");
		System.out.println("Test ob Ziffer 7 in einer Zahl = 4");
		System.out.println("Summe von 0 bis n = 5");
		int zahl = IO.readInt("Was möchten Sie machen?");
		switch(zahl) {
		case 1: {
			floatWerte.main(args);
			break;
		}
		case 2: {
			KleinerePrimzahl.main(args);
			break;
		}
		case 3: {
			Runden.main(args);
			break;
		}
		case 4: {
			SiebenTest.main(args);
			break;
		}
		case 5: {
			Summe.main(args);
			break;
		}
		}
				
	}
}
