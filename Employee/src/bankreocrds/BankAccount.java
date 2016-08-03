package bankreocrds;

public class BankAccount {
	int index;
	double balance;
	
	public BankAccount() {
		this.index = index;
	}
	public BankAccount(double value){
		this.index = index;
	}
	public void setBalance(int index) {
		this.index = index;
	}
	public int getBalance(){
		return index;
	}
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		 BankAccount bankAccount1 = new BankAccount(100.00);
		bankAccount.setBalance(1000);
		System.out.println(bankAccount.getBalance());
	}

}
