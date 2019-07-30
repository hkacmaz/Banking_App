package Phase1;

import java.math.BigInteger;

public class Account {
	
	int account_number = 123456789;
	double balance = 50.0;
	String customer_name = "Halil";
	String email = "asdf@asdf.com";
	int phone_number = 415770;
	
	public void Account() {
		
		System.out.println("Account No: " + account_number);
		System.out.println("Current Balance: "+ balance);
		System.out.println("Account Holder: "+ customer_name);
		System.out.println("Email: "+ email);
		System.out.println("Phone Number: "+ phone_number);
		
	}

}
