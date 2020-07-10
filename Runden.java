
public class Runden {
	public static void main(String []args){
		double a = IO.readDouble();
		int b = (int) a;
		System.out.println(b); //Konvertierung in int schneidet Wert nur ab, man benörigt Math.round
	}
}
