
public class Aufgabe_2a {
	static int grenze = IO.readInt();

	public static void main(String[] args) {
		int abc = fiboBerechnen();
		boolean z = istFiboZahl(abc, grenze);
		System.out.println(z); 
	}

	static int fiboBerenen() {
		int fiboZahl = 0;
		int summand1 = 1;
		int summand2 = 2;
	
	  while(fiboZahl < grenze) {
		fiboZahl = summand1 + summand2;
		summand1 = summand2;
		summand2 = fiboZahl; 
		}
		return fiboZahl;
	  }
	static boolean istFiboZahl(int a, int b) {
		if(a == b) {
			return true;
		}else {
			return false;
		}
		}
	}