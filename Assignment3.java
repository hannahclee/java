
public class Assignment3 {

	public static void main(String[] args) {
		
		printPowersOfN(5,3);
		printPowersOfN(2,7);


	}
	
	public static void printPowersOfN(int number, int count) {
		
		for(int i = 0; i <= count; i++) {
			int power = (int) Math.pow(number, i);
			System.out.print(power + " ");
		}
		System.out.println();
	}

}