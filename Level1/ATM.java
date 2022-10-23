import java.util.Scanner;

class ATM{
	
	public static int balance  = 0;
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int option;
		
		do{
			
			System.out.println("Choose any operation from below");
			System.out.println("enter 1 to display the balance");
			System.out.println("enter 2 to deposit");
			System.out.println("enter 3 to withdraw");
			System.out.println("enter 4 to close transaction");
			
			option = sc.nextInt();
			
			switch(option){
				case 1:
					displayBalance();
					break;
				case 2:
					depositMoney();
					break;
				case 3:
					withdrawMoney();
					break;
				default:
					System.out.println("Invalid Input");
			}
			
		}while(option !=  4);
		
	}
	
	public static void displayBalance(){
		System.out.println("Your Balance is: "+balance);
	}
	
	public static void depositMoney(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter money to deposit");
		int deposit = sc.nextInt();
		if(deposit > 0){
			balance += deposit;
		}else{
			System.out.println("Invalid Amount");
		}
		displayBalance();
	}
	
	public static void withdrawMoney(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter money to withdraw");
		int withdraw = sc.nextInt();
		if(withdraw > 0 && balance >= withdraw){
			balance -= withdraw;
		}else{
			System.out.println("Invalid Amount");
		}
		displayBalance();
	}
}