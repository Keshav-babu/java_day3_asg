package masai.oops;

public class Account {
	private int balance;
	
	public void credit(int amount) {
		this.balance+=amount;
		
	}
	
	public void debit(int amount) {
		if(balance>100 && balance-amount>100) {
			balance-=amount;
			System.out.println("You can credit your amount");
			System.out.println("left balance "+balance);
		}else {
			System.out.println("Your account balance must be minimum of 100Rs");
			
			System.out.println("So you can't debit your amount");
		}
		
	}
	public int getBalance() {
		return balance;
	}

}
