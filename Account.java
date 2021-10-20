
//Account



package ATM.ATM_APP;
import java.util.Random;
import java.text.DecimalFormat;
import java.util.*;

public class Account {

	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}

	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}

	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}

	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}

	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to withdraw from Checking Account: ");
		double amount = input.nextDouble();

		if ((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			Random rd = new Random(); // creating Random object
			int[] arr = new int[1];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = rd.nextInt();
				System.out.println("\n---------------------------------"); // storing random integers in an array
				System.out.println("Reference Number: "+arr[i]);
				System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance)); // printing each array element
				System.out.println("---------------------------------\n");
			}
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}

	public void getsavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to withdraw from saving Account: ");
		double amount = input.nextDouble();

		if ((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			Random rd = new Random(); // creating Random object
			int[] arr = new int[1];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = rd.nextInt(); // storing random integers in an array
				System.out.println("\n---------------------------------");
				System.out.println("Reference Tracking: "+arr[i]); // printing each array element
				System.out.println("New saving Account Balance: " + moneyFormat.format(savingBalance));
				System.out.println("---------------------------------\n");
			}
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}

	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to Deposit from Checking Account: ");
		double amount = input.nextDouble();

		if ((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			Random rd = new Random(); // creating Random object
			int[] arr = new int[1];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = rd.nextInt(); // storing random integers in an array
				System.out.println("\n---------------------------------");
				System.out.println("Reference Tracking: "+arr[i]); // printing each array element
				System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
				System.out.println("---------------------------------\n");
			}
			
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}

	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to Deposit from saving Account: ");
		double amount = input.nextDouble();

		if ((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			Random rd = new Random(); // creating Random object
			int[] arr = new int[1];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = rd.nextInt(); // storing random integers in an array
				System.out.println("\n---------------------------------");
				System.out.println("Reference Tracking: "+arr[i]); // printing each array element
				System.out.println("New saving Account Balance: " + moneyFormat.format(savingBalance));
				System.out.println("---------------------------------\n");
			}
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}

	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
}
