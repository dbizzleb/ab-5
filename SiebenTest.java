
public class SiebenTest {
	public static void main (String [] args) {
		int a = IO.readInt("Bitte Zahl eingeben:");
		String b = String.valueOf(a);
		if(b.contains("7")) {
			System.out.println("Die eingegebene Zahl enth�lt eine 7.");
		}
		else {
			System.out.println("Die eingegebene Zahl enth�lt keine 7.");
		}
	}
}
