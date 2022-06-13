package masai.oops;

public class AccountAunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account SBI=new Account();
		SBI.credit(500);
		SBI.debit(200);
		int balance1=SBI.getBalance();
		System.out.println(balance1);
		
		
				
	}

}
