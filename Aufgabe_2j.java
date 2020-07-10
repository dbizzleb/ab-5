
public class Aufgabe_2j {
	public static void main(String[] args) {
 		System.out.println(uhrzeitAddieren());
	}

	static float uhrzeitAddieren() {
		System.out.println("Geben Sie zwei Uhrzeiten ein.");
		float ersteUhrzeit = IO.readFloat();
		float zweiteUhrzeit = IO.readFloat();
		int stundenVonA = (int) ersteUhrzeit;
		int stundenVonB = (int) zweiteUhrzeit;
		int minutenVonA = (int) (ersteUhrzeit * 100) % 100;
		int minutenVonB = (int) (zweiteUhrzeit * 100) % 100;
		if(stundenVonA > 24 || stundenVonB > 24) {
		    System.out.println("Bitte geben Sie gültige Werte ein.");
			
		}else if(minutenVonA > 60 || minutenVonB > 60) {
			System.out.println("Bitte geben Sie gültige Werte ein.");
		}
		if ((stundenVonA + stundenVonB) >= 24) {
			neueStunden = neueStunden - 24;
		}
		float neueMinuten = minutenVonA + minutenVonB;
		if ((minutenVonA + minutenVonint stundenVonA = (int) ersteUhrzeit;
		
		float neueStunden = stundenVonA + stundenVonB;
			System.out.println("B) >= 60) {
			neueStunden++;
			neueMinuten = neueMinuten - 60;
		}

		float neueUhrzeit = neueStunden + (neueMinuten / 100);

		return neueUhrzeit;

	}
}

