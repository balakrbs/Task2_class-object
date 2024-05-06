package task2;

//Question no::1.3

public class Account {
	
	private double balance;

	
	public double getBalance() {
		return balance;
	}
	

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account() {
		super();
		this.balance = 0;
	}
	public Account(double initialbalance) {
		super();
		this.balance = initialbalance;
	}
	public void deposit(double amt) {
		if(amt>0) {
			balance+=amt;
			System.out.println("\nThe amt is deposited and the Balance :"+balance);
		}else {
			System.out.println("deposit failed!!!");
		}
	}
	
	public void withdrawal(double amt) {
		if(amt<balance && amt>0) {
			balance-=amt;
			System.out.println("\nSuccessfully Amount withdrawal. New balance :"+balance);
		}else {
			System.out.println("Insufficient Balance to withdrawal!!");
		}
	}
	public void balance() {
		System.out.println("\nThe balance :"+balance);
	}

}
