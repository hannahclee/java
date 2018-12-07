
public class Ticket {
	
	private int number;
	private double price;
	
	public Ticket (int number) {
		
		this.number = number;
		this.price = 0.0;
	}
	
	public double getPrice() {
		
		return this.price;
	}
	
	public String toString() {
		return "Number: " + this.number + " , " + "Price: " + this.price;
	}
	
	public class WalkupTicket extends Ticket{
		
		public WalkupTicket (int number) {
			super(number);
			super.price = 50.0;
		}
		

		
	}
	
	public static void main(String[] args) {
		Ticket robyn = new Ticket (12);
		System.out.println(robyn.toString());
		WalkupTicket snoop = robyn.new WalkupTicket(3);
		System.out.println(snoop.getPrice());
		System.out.println(snoop.toString());

	}

}
