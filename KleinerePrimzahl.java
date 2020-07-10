
public class KleinerePrimzahl {
	public static void main (String [] args) {
		int a =IO.readInt();
		for(int x= a-1; x > 1; x--){
			for(int y = x/2; y > 1; y--){
				if(x%y==0){
					break;
				}
				if(y == 2){
					System.out.println(x + " Primzahl");
				}
			}
		}
	}
}