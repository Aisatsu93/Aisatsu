package answer;

class BankAccount {
	int balance = 0;
	
	public int deposit(int amount)
	{
		balance += amount;
		return balance;
	}
	public int withdraw(int amount)
	{
		balance -= amount;
		return balance;
	}
	public int checkMyBalance()
	{
		System.out.println("�ܾ� : " + balance);
		return balance;
	}
}

public class BankAccount00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		yoon.deposit(5000);
		park.deposit(3000);
		
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		yoon.checkMyBalance();
		park.checkMyBalance();
		
	}

}
