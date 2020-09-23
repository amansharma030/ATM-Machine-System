import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.text.DecimalFormat;

public class OptionMenu extends Account {
Scanner menuInput = new Scanner(System.in);
DecimalFormat moneyFormat= new DecimalFormat("'Rs' ###,##0.00");

HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
int n=1; int selection; int x=1;

public void getAccess() throws Exception
{
	System.out.println("");
	System.out.println("===========================");
	System.out.println("     Welcome to ATM"); 
	System.out.println("===========================");
	System.out.println("");
	
	System.out.println("Select the Appropriate Option: ");
	System.out.println("");
	System.out.println("Type 1 - Access Account");
	System.out.println("Type 2 - Generate Token Number");
	System.out.println("Choice: ");
	
	 selection = menuInput.nextInt();
 	
 	switch (selection) {
 	case 1:
 		getLogin();
 		break;
 	case 2:
 		getTokenNumber();
 		getAccess();
 		break;
 	
 	default:
     	System.out.println("\n" + "Invalid choice." + "\n");
     	getAccess();
     	
 	}
}


public void getLogin() throws IOException, Exception{
	
	 
	do {
		try {
			data.put(999999,1234);
			data.put(888888,9874);
			data.put(877888,1134);
			
			
			
			
			System.out.println("Enter Your Customer Number: ");
			setCustomerNumber(menuInput.nextInt());
			System.out.println("Enter Your Pin Number: ");
			setPinNumber(menuInput.nextInt());
					
				}catch (Exception e) {
					System.out.println("\n" + "Invalid character(s). Only numbers. "+ "\n"); 
					x=2;
				}
		
		for (Entry<Integer, Integer> entry : data.entrySet()) {
			if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber())
			{
				getAccountType();
		     	
		}
			
	
		}
		
			System.out.println("\n" + "Wrong Coustomer Number or Pin Number." + "\n");
		
		
                
	               
	}while(x==1);
	
	
}

                public void getAccountType() throws Exception
                {
                	System.out.println("");
                	System.out.println("Select the Account you want to access: ");
                	System.out.println("Type 1 - Current Account");
                	System.out.println("Type 2 - Saving Account ");
                	System.out.println("Type 3 - Exit");
                	System.out.println("Choice: ");
                	
                	selection = menuInput.nextInt();
                	
                	switch (selection) {
                	case 1:
                		getCurrent();
                		break;
                	case 2:
                		getSaving();
                		break;
                	 case 3:
                		System.out.println("Thank You for using ATM, bye.");
                		x=2;
                		break;
                		
                		default:
                			System.out.println("\n" + "Invalid Choice." + "\n");
                		getAccountType();
                	                	}
                }
                
             public void getCurrent() throws Exception
             {
                	System.out.println("Current Account: ");
                	System.out.println("Type 1 - View Balance");
                	System.out.println("Type 2 - Withdraw Funds");
                	System.out.println("Type 3 - Deposit Funds");
                	System.out.println("Type 4 - Exit");
                	System.out.println("Choice: "); 
                	
                    selection = menuInput.nextInt();
                    
                    switch (selection) {
                    case 1:
                    System.out.println("Current Account Balance: " + moneyFormat.format(currentBalance));
                    getAccountType();
                    break;
                    
                    case 2:
                    getCurrentWithdrawInput();
                    getAccountType();
                    break;
                    
                    case 3:
                    getCurrentDepositInput();
                    getAccountType();
                    break;
                    
                    case 4:
                    System.out.println("Thank You for using ATM, bye.");
                    x=2;
                    break;
                    
                    default:
                    	System.out.println("\n" + "Invalid choice." + "\n");
                    	getCurrent();
                    	                    
                    
                    }
                }
                
                public void getSaving() throws Exception{ 
                	System.out.println("Saving Account: ");
                	System.out.println("Type 1 - View Balance");
                	System.out.println("Type 2 - Withdraw Funds");
                	System.out.println("Type 3 - Deposit Funds");
                	System.out.println("Type 4 - Exit");
                	System.out.println("Choice: "); 
                	
                	selection = menuInput.nextInt();
                	
                	switch(selection) {
                	case 1:
                	System.out.println("Current Account Balance: " + moneyFormat.format(savingBalance));
                    getAccountType();
                    break;
                	
                	 case 2:
                	 getSavingawithdrawInput();
                     getAccountType();
                     break;
                     
                	 case 3:
                     getSavingDepositInput();
                     getAccountType();
                     break;
                    
                	 case 4:
                	 System.out.println("Thank You for using this ATM, bye.");
                	 x=2;
                	 break;
                	 
                    default:
                    	System.out.println("\n" + "Invalid choice." + "\n");
                    	getSaving();
                    	
                	}
                	
                	
                }
                
                
                
                public void getTokenNumber()throws Exception
                {
                     
                	System.out.println("Your Token Number is : "+n);
                	n++;
                	
                	
                }
                
                
}






