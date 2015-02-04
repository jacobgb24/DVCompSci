import java.util.Scanner;
public class Banking {
	public static void main(String[] args) {
		int user;
		String choice;
		int amount;
		Account acct1 = new Account("John Doe", 0001, 9000.01);
		Account acct2 = new Account("Bill Smith", 0002, 174.00);
		Account acct3 = new Account("Susan Smith", 0003, 23.56);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter account number");
		user = sc.nextInt();
		if(user==acct1.getAccountNumber()){
				System.out.println("Would you like to deposit or withdraw funds?");
				choice = sc.next();
				if(choice.equalsIgnoreCase("w") || choice.equalsIgnoreCase("withdraw")){
					System.out.println("Please enter amount to withdraw");
					amount = sc.nextInt();
					acct1.withdraw(amount, 0);
				}
				if(choice.equalsIgnoreCase("d") || choice.equalsIgnoreCase("deposit")){
					System.out.println("Please enter amount to deposit");
					amount = sc.nextInt();
					acct1.deposit(amount);
				}
				else
					System.out.println("Invalid choice");
		}
		else if(user==acct2.getAccountNumber()){
			System.out.println("Would you like to deposit or withdraw funds?");
			choice = sc.next();
			if(choice.equalsIgnoreCase("w") || choice.equalsIgnoreCase("withdraw")){
				System.out.println("Please enter amount to withdraw");
				amount = sc.nextInt();
				acct2.withdraw(amount, 0);
			}
			if(choice.equalsIgnoreCase("d") || choice.equalsIgnoreCase("deposit")){
				System.out.println("Please enter amount to deposit");
				amount = sc.nextInt();
				acct2.deposit(amount);
			}
			else
				System.out.println("Invalid choice");
		}
		else if(user==acct3.getAccountNumber()){
			System.out.println("Would you like to deposit or withdraw funds?");
			choice = sc.next();
			if(choice.equalsIgnoreCase("w") || choice.equalsIgnoreCase("withdraw")){
				System.out.println("Please enter amount to withdraw");
				amount = sc.nextInt();
				acct2.withdraw(amount, 0);
			}
			if(choice.equalsIgnoreCase("d") || choice.equalsIgnoreCase("deposit")){
				System.out.println("Please enter amount to deposit");
				amount = sc.nextInt();
				acct2.deposit(amount);
			}
			else
				System.out.println("Invalid choice");
		}
		else
			System.out.println("User not found");
		
		acct1.addInterest();
		acct2.addInterest();
		acct3.addInterest();
		
		System.out.println();
		System.out.println(acct1+"\n"+acct2+"\n"+acct3);
	}
}
