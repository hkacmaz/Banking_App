package Phase1;

import java.util.Scanner;

public class EntryClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean program = true;
		
		String s;
		
		Scanner scan1 =  new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		Account account_object = new Account();
		
		while (program) {
			
			System.out.println("Here are the options");
			System.out.println(" A -> Account Balance \n D -> Deposit Balance \n W -> Withdraw Money \n S -> Account Summary \n E -> Exit ");
			
			s = scan1.nextLine();
			
			switch (s) {
			case "A": //Account Balance
				account_object.Account_Balance();
				break;
				
			case "D": //Deposit Balance
				System.out.println("deposit balance");
				int amount_entered = 0;
				System.out.println("Please enter the amount= ");
				amount_entered = scan2.nextInt();
				account_object.Deposit_Balance(amount_entered);
				break;
				
			case "W": //Withdraw Money
				System.out.println("withdraw");
				break;
				
			case "S": //Account Summary
				System.out.println("summary");
				account_object.Account();
				break;
				
			case "E": //Exit
				System.out.println("exit --- BYE ---");
				program = false;
				break;

			default:
				System.out.println("Please enter a proper input A,D,W or E");
				break;
			}
			
		}
		
	}



}
