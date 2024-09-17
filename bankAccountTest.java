package practice9_5;

public class bankAccountTest {

	public static void main(String[] args) {
		bankAccount customer1 = new bankAccount("A001", "Bethany");
		customer1.deposit(1000);
		System.out.println("Name: " + customer1.getName() + " - ID: " + customer1.getId() + " -  Current Balance: $" + customer1.checkBalance());
		System.out.println("Number of years for " + customer1.getName() + "'s balance to double: " + bankAccount.doubleBalance(customer1.checkBalance()));
		
		bankAccount customer2 = new bankAccount("A002", "Jason");
		customer2.deposit(1500);
		System.out.println("Name: " + customer2.getName() + " - ID: " + customer2.getId() + " -  Current Balance: $" + customer2.checkBalance());
		System.out.println("Number of years for " + customer2.getName() + "'s balance to double: " + bankAccount.doubleBalance(customer2.checkBalance()));
	}

}
