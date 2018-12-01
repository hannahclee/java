import java.util.Scanner;

public class BankAccount {
	
	private String name;
	private double balance;
	private double transactionFee;

	public BankAccount(String uName,double uBalance) {
		
		this.name = uName;
		this.balance = uBalance;
		this.transactionFee = 0.00;


	}

	
	public void deposit(double amount) {
		this.balance = this.balance + amount;
		
	}
	
	public void withdraw(double amount) {
		
		double updatedBalance = this.balance - amount - this.transactionFee;
		
	if(updatedBalance >= 0) {
		this.balance = updatedBalance; 
	}else {
		System.out.print("Insufficient Funds");
	}
		

	}
	
	public void setTranscationFee(double value)
	{
	 
	     this.transactionFee = value;
	}
	
	public String toString() {
		return this.name + " , " + this.balance;
	}
	

public static void main(String[] args){
    BankAccount me = new BankAccount("Phil",200.0);
    System.out.println("My account is: " + me.toString());
    me.withdraw(10.00);
    System.out.println("My account is: " + me.toString());
    me.setTranscationFee(3.0);
    me.withdraw(7.00);
    System.out.println("My account is: " + me.toString());
    me.withdraw(60.0);
}


}




