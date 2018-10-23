import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number for month: ");
		int month = input.nextInt();
		System.out.print("Enter number for day: ");
		int day = input.nextInt();
		System.out.println(seasons(month, day));
		

	}
	
	public static String seasons (int month, int day) {
		
		if(month <= 2 || 
		  (month == 3 && day <= 15) || 
		  (month == 12 && day <= 16) ) {
			return "Winter";
		}else if(month > 3 && month < 6 || 
				(month == 3 && day >= 16) || 
				(month == 6 && day <= 15)) {
			return "Spring";
		}else if(month > 6 && month < 9 ||
				(month == 6 && day >= 16) ||
				(month == 9 && day <= 15)){
			return "Summer";
		}else {
			return "Fall";
		}	
		
	}

}
