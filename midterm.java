import java.util.Random;

public class midterm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//by Derek Hendrick and Hannah Lee
				Random rand = new Random();
				randomWalk(rand);

			}
			
			public static void randomWalk(Random rand) {
				int position = 0;
				int maxPosition = 0;
				int positionChange = 0;
				while(position > -3 && position < 3) {
					//Choosing forward or backward
					positionChange = rand.nextInt(2);
					if(positionChange == 1) {
						//Move forward
						position++;
					}
					else {
						//Move backward
						position --;
					}
					//Updating max position
					if(position > maxPosition) {
						maxPosition = position;
					}
					//Printing current position
					System.out.println("Position: "+position);
				}
				//Printing max position
				System.out.println("Max Position:"+maxPosition);
				
			}
	}

