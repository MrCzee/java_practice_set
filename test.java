package demo;

import java.util.Scanner;
abstract class Acccount {
	 protected String id;
		protected double balance;
		Acccount(String i, double bal){
			id=i;
			balance=bal;
		}
		public String getID() {
			return id;
		}
		public double getBalance()
		{
			return balance;
			
		}
		public abstract boolean withdraw(double amount); 
		public abstract void deposit(double amount);
	}

	class SavingsAccount extends Acccount{	
		private static final String id = null;
		public static double InitialDeposit=0.0;
		SavingsAccount(){
			super (id, InitialDeposit);
			InitialDeposit= balance;
		}
		public void deposit(double amount) {
			balance=balance+amount;
		} 
			public boolean withdraw(double amount) {
			if(amount>=10) {
				balance=balance-amount;
				balance-=2.0;
				return true;
			}
			else
				return false;
		}

}

public class test {
public static void main(String[] args) {
	
	 
	// TODO Auto-generated method stub
			System.out.println("Dear Aqib Memon");  
			SavingsAccount box = new SavingsAccount();
			box.deposit(15);
			double new_balance = box.getBalance();
			System.out.println("Your balance is : "+new_balance);
			boolean w= box.withdraw(12);
			System.out.println(w);
			double g=box.getBalance();
			System.out.println("Your new balance after withdrawal is : "+ g);

	
}




}



