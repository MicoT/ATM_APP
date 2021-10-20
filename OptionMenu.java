//Option Menu Class



package ATM.ATM_APP;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.io.IOException;
import java.util.Scanner;

public class OptionMenu extends Account {
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

	public void getLogin() throws IOException {
		int x = 1;
		do {
			try {
				data.put(696969, 696969);
				data.put(120235, 156324);
				data.put(894984, 156749);
				data.put(189465, 123546);
				data.put(696969, 156489);
				data.put(123465, 789461);
				data.put(888512, 156748);

				System.out.println("Welcome to the ATM Project!");
				System.out.print("Enter your customer Number: ");
				setCustomerNumber(menuInput.nextInt());

				System.out.print("Enter your PIN Number: ");
				setPinNumber(menuInput.nextInt());
			} catch (Exception e) {
				System.out.println("\n" + "Invalid Character(s). Only Numbers." + "\n");
				x = 2;
			}
			/*
			 * for(Map.Entry<Integer,Integer> it : data.entrySet()){
			 * if(it.getkey()==getCustomerNumber() && it.getValue()==getPinNumber){
			 * getAccountType(); } }
			 */
			int cn = getCustomerNumber();// 1
			int pn = getPinNumber();//1
			if (data.containsKey(cn) && data.get(cn) == pn) {//N+1
				getAccountType();// 1
			} else
				System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n"); //1
		} while (x == 1);//o(n)
	}

	public void getAccountType() {
		System.out.println("\nSelect the Account you Want to Access: ");
		System.out.println(" Type 1 - Checking Account");
		System.out.println(" Type 2 - Saving Account");
		System.out.println(" Type 3 - Exit\n");

		int selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			getChecking();
			break;

		case 2:
			getSaving();
			break;

		case 3:
			System.out.println("Thank You for using this ATM, bye.  \n");
			break;

		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getAccountType();
		}
	}

	public void getChecking() {
		System.out.println("\nChecking Account: ");
		System.out.println(" Type 1 - View Balance");
		System.out.println(" Type 2 - Withdraw Funds");
		System.out.println(" Type 3 - Deposit Funds");
		System.out.println(" Type 4 - Exit");
		System.out.print("Choice: ");

		int selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;

		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;

		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;

		case 4:
			System.out.println("Thank You for using this ATM, bye.");
			break;

		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getChecking();
		}
	}

	public void getSaving() {
		System.out.println("\nSaving Account: ");// 1
		System.out.println(" Type 1 - View Balance"); //1
		System.out.println(" Type 2 - Withdraw Funds"); //1
		System.out.println(" Type 3 - Deposit Funds"); //1
		System.out.println(" Type 4 - Exit");//1
		System.out.print("Choice: \n");//1

		int selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;

		case 2:
			getsavingWithdrawInput();
			getAccountType();
			break;

		case 3:
			getSavingDepositInput();
			getAccountType();
			break;

		case 4:
			System.out.println("Thank You for using this ATM, bye.");
			break;

		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getChecking();
		}
	}
	
}
