
public class assignment6 {

	public static void main(String[] args) {
		
		double [] list1 = {16.1, 12.3, 22.2, 14.4};
		double [] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		
		if(isSorted(list1)) {
			System.out.println("List1 is in sorted (nondecreasing) order");
		}
		else {
			System.out.println("List1 is NOT in sorted (nondecreasing) order");
		}
		
		if(isSorted(list2)) {
			System.out.println("List2 is in sorted (nondecreasing) order");
		}
		else {
			System.out.println("List2 is NOT in sorted (nondecreasing) order");
		}

	}
	
	public static boolean isSorted(double[] list) {
		for(int i=0; i < list.length -1; i++) {
			if(list[i+1] < list[i]) {
				return false;
			}
		}
		return true;
	}

}
