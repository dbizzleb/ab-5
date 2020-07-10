
public class Uhrzeit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Geben Sie eine Uhrzeit ein: ");
		float a = IO.readFloat();
		System.out.println("Geben Sie eine weitere Uhrzeit ein: ");
		float b = IO.readFloat();
		
		float c = a+b;
		
		if (c>24) {
			float z=(c-24)*100;
		System.out.println(z/100
				);
		}
		else {System.out.println(c);}
	}

}
