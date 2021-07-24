import java.util.Scanner;

public class AtmMschine {


	
	public double totalBal = 100;
	Scanner input = new Scanner(System.in);

	public int userAccount() {

		System.out.println("Please Enter your account number: ");
		int account = input.nextInt();
		return account;
	}

	public int userPin() {

		System.out.println("Please Enter your pin number: ");
		int pin = input.nextInt();
		return pin;
	}

	public void startAtm() {
		userAccount();
		userPin();
		drawMainMenu();
	}

	public void drawMainMenu() {

		System.out.println("ATM main menu:-");
		System.out.println("1 - View account balance");
		System.out.println("2 - Withdraw funds");
		System.out.println("3 - Add funds");
		System.out.println("4 - Terminate transaction");
		System.out.println("Choice: ");
		int selection = input.nextInt();
		switch (selection) {
		case 1:
			viewAccountInfo();
			break;
		case 2:
			withdrawFunds();
			break;
		case 3:
			addFunds();
			break;
		case 4:
			System.out.println("Thank you for using this ATM! Goodbye");

		}

	}

	public void addFunds() {

		System.out.println("Deposit funds: ");
		System.out.println("1 - $20");
		System.out.println("2 - $40");
		System.out.println("3 - $60");
		System.out.println("4 - $100");
		System.out.println("5 - Back to main menu");
		System.out.println("Choice: ");
		int addSelection = input.nextInt();
		switch (addSelection) {
		case 1:
			deposit(20);
			drawMainMenu();
			break;
		case 2:
			deposit(40);
			drawMainMenu();
			break;
		case 3:
			deposit(60);
			drawMainMenu();
			break;
		case 4:
			deposit(100);
			drawMainMenu();
			break;
		case 5:
			drawMainMenu();
			break;

		}

	}

	public void withdrawFunds() {

		System.out.println("Withdraw funds: ");
		System.out.println("1 - $20");
		System.out.println("2 - $40");
		System.out.println("3 - $60");
		System.out.println("4 - $100");
		System.out.println("5 - Back to main menu");
		System.out.println("Choice: ");
		int withdrawSelection = input.nextInt();
		switch (withdrawSelection) {
		case 1:
			deposit(20);
			drawMainMenu();
			break;
		case 2:
			deposit(40);
			drawMainMenu();
			break;
		case 3:
			deposit(60);
			drawMainMenu();
			break;
		case 4:
			deposit(100);
			drawMainMenu();
			break;
		case 5:
			drawMainMenu();
			break;

		}

	}

	public void viewAccountInfo() {
		System.out.println("Account Information: ");
		System.out.println("\t--Total Balance: $" + totalBal);
		drawMainMenu();

	}

	public void deposit(int depAmount) {
		System.out.println("Please insert your money now.");
		totalBal = totalBal + depAmount;

	}

	public void checkNsf(int withdrawAmount) {
		if (totalBal - withdrawAmount < 0) {

			System.out.println("Error! Insuffcient founds in your account.");

		} else {

			totalBal = totalBal - withdrawAmount;
			System.out.println("Please take your money now...");

		}

	}

	public static void main(String[] args) {
		AtmMschine am = new AtmMschine();
		am.startAtm();

	}

}
