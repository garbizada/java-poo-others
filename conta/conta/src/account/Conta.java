package account;

public class Conta {

	private String num_conta;
	private String name_holder;
	private double saldo;
	

	


	public Conta(String num_conta, String name_holder, double saldo) {

		this.num_conta = num_conta;
		this.name_holder = name_holder;
		this.saldo = saldo ;
	}
	
	public Conta(String num_conta, String name_holder ) {
		this.num_conta = num_conta;
		this.name_holder = name_holder;
	}
	
	

	public String getNum_conta() {
		return num_conta;
	}

	public String getName_holder() {
		return name_holder;
	}

	public void setName_holder(String name_holder) {
		this.name_holder = name_holder;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposit(double amount) {
		saldo += amount;
	}

	public void withdraw(double amount) {
		saldo = this.saldo - (amount + 5);
	}

	public String toString() {

		return "Account " + num_conta + ", Name: " + name_holder + ", Saldo: $ " + String.format("%.2f", saldo);
	}

}
