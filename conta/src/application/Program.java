package application;

import java.util.Locale;
import java.util.Scanner;

import account.Conta;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta conta1;

		System.out.println("Enter account number: ");
		String num_conta = sc.nextLine();
		
		

		System.out.println("Enter account holder name: ");
		String name_holder = sc.nextLine();
		
		double saldo = 0;

		System.out.println("Is there an initial deposit (y/n)?");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			saldo = sc.nextDouble();
			conta1 = new Conta(num_conta, name_holder, saldo);
		}
		else {
			conta1 = new Conta(num_conta, name_holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta1.toString());
		
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositoValue = sc.nextDouble();
		conta1.deposit(depositoValue);
		System.out.println(conta1);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		conta1.withdraw(withdrawValue);
		System.out.println(conta1);
		
		
		
		sc.close();
	}

}
