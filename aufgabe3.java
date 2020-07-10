
public class aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Wie viele Stufen möchten Sie ausgeben?");
		int stufen=IO.readInt();
		int freiZeichen=stufen;
		int nummer=1;
		
		for(int i=0;i<stufen;i++) {
			//freizeichen
			for(int s=1;s <= freiZeichen;s++) {
				System.out.print(" ");
			}
			nummer=1;
			for (int j=0;j<=i;j++) {
				System.out.print(nummer+ " ");
				nummer = nummer * (i-j)/(j+1);
			}
			freiZeichen--;
			System.out.println();
					
		}
		

	}

}
