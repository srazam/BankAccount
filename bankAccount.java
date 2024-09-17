package practice9_5;

public class bankAccount {
	//Don't need static because every account needs this
	private String id;
	private String userName;
	private double balance;
	
	//Use static for this because all accounts have the same interest rate and no one needs to see number of accounts
	private static double interestRate = 0.065;
	private static int numOfAcc = 0;
	
	public bankAccount (String id, String userName)
	{
		this.id = id;
		this.userName = userName;
		balance = 0;
		numOfAcc += 1;
	}
	
	public String getId()
	{
		return id;		
	}
	
	public String getName()
	{
		return userName;		
	}
	
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	public double checkBalance()
	{
		return balance;
	}
	
	public double checkInterestRate()
	{
		return interestRate;
	}
	
	//Static method for figuring out when the balance is doubled 
	public static int doubleBalance(double currentBalance)
	{
		int years = 0;
		double finalBalance = currentBalance;
		
		while(finalBalance < (currentBalance * 2))
		{
			finalBalance = finalBalance * (1.0 + interestRate);
			years += 1;
			
		}
		
		return years;
	}
	
}
