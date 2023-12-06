package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	
	public static void main(String[] args) {
		
		Account acc1 = new Account(1001, "Alex", 0.0);
		
		BusinessAccount bacc1 = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		
		Account acc2 = bacc1;
		Account acc3 = new BusinessAccount(1003,"Bob", 0.0, 200.0);
		Account acc4 = new SavingsAccount(1004, "Anna",0.0, 0.01 );
		
		
		
		
	}

}
