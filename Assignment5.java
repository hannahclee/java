import java.util.Random;

public class Assignment5 {

	public static void main(String[] args) {

		makeGuesses();
	}
	
	public static void makeGuesses() {
		
		Random r = new Random();
		int rNum = r.nextInt(50) + 1;
		int guesses = 1;
		
		while(rNum < 48) {
			System.out.println("guess = " + rNum);
			rNum = r.nextInt(51);
			if(rNum >= 48) {
				System.out.println("guess = " + rNum);
			}
			guesses++;
		}
		
		System.out.print("Total Guesses: " + guesses);
		
	}

}
