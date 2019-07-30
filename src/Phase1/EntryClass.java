package Phase1;

import java.util.Scanner;

public class EntryClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean program = true;
		
		String s;
		
		Scanner scan1 =  new Scanner(System.in);
		
		while (program) {
			
			System.out.println("Here are the options");
			System.out.println(" A -> Account Balance \n D -> Deposit Balance \n W -> Withdraw Money \n E -> Exit ");
			
			s = scan1.nextLine();
			
			switch (s) {
			case "A":
				System.out.println("add balance");
				break;
				
			case "D":
				System.out.println("deposit");
				break;
				
			case "W":
				System.out.println("withdraw");
				break;
				
			case "E":
				System.out.println("exit --- BYE ---");
				program = false;
				break;

			default:
				System.out.println("Please enter a propor input A,D,W or E");
				break;
			}
			
		}
		
	}



}
