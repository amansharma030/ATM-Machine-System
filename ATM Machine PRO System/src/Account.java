import java.text.DecimalFormat;
import java.io.IOException;
import java.util.*;

public class Account {
	
	 private int customerNumber;
	 private int pinNumber;
	 double currentBalance = 0;
	 double savingBalance = 0;

	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat= new DecimalFormat("'Rs.' ###,##0.00");
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
		
	}
	
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber= pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	
	
	public void calcCurrentWithdraw(double amount) {
		currentBalance = (currentBalance - amount);
		
		  
	}
	
	public void calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		
	}
	
	public void calcCurrentDeposit(double amount) {
		currentBalance = (currentBalance + amount);
		
	}
	
	public void calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		
	}
	
	public void getCurrentWithdrawInput() throws Exception{
		System.out.println("Current Account Balance: " + moneyFormat.format(currentBalance));
		System.out.println("Amount you want to withdraw from Current Account: ");
		double amount = input.nextDouble();
		
		if((currentBalance - amount) >= 0) {
			calcCurrentWithdraw(amount);
			System.out.println("New Current Account balance: "+ moneyFormat.format(currentBalance));
		}else {
			System.out.println("Balance cannot be negative: " + "\n");
		}
	}
		
		public void getSavingawithdrawInput() {
			System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
			System.out.println("Amount you want to withdraw from Saving Account: ");
			double amount=input.nextDouble();
			
			if((savingBalance - amount) >= 0)
			{
				calcSavingWithdraw(amount);
				System.out.println("New Saving Account Balance: " + savingBalance + "\n");
			}else {
				System.out.println("Balance cannot be negative: " + "\n");
			}
		}
		
		public void getCurrentDepositInput() {
			
			System.out.println("Current Account Balance: " + moneyFormat.format(currentBalance));
			System.out.println("Amount you want to deposit from Current Account: ");
			double amount=input.nextDouble();
			 
			if((currentBalance + amount) >= 0)
			{
				calcCurrentDeposit(amount);
				System.out.println("New Current Account Balance: " + moneyFormat.format(currentBalance));
			}else {
				System.out.println("Balance cannot be negative: " + "\n");
			}
		}
		
public void getSavingDepositInput() {
			
			System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
			System.out.println("Amount you want to deposit from Saving Account: ");
			double amount=input.nextDouble();
			 
			if((savingBalance + amount) >= 0)
			{
				calcSavingDeposit(amount);
				
				  System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
			}else {
				System.out.println("Balance cannot be negative: " + "\n");
			}
		}
		
}


