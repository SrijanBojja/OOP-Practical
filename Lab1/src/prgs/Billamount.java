package prgs;
import java.util.Scanner;

public class Billamount {

	public static void main(String[] args) {
		double total_bill_amount, discount, total_amount;
		
		
		System.out.println("Enter Total Bill: ");
		Scanner bill = new Scanner(System.in);
		System.out.println("Enter GST percent: ");
		Scanner gst = new Scanner(System.in);
		System.out.println("Enter Maintainence percent: ");
		Scanner maintainence = new Scanner(System.in);
		
		total_bill_amount = bill.nextDouble() + gst.nextDouble() + maintainence.nextDouble();
		
		
		if(total_bill_amount > 1000) {
			discount = total_bill_amount * 0.10;
		}
		else {
			discount = total_bill_amount * 0.05;
		}
		
		System.out.println("Discount Amount: " +discount);
		total_amount = total_bill_amount - discount;
		System.out.print("Total Bill: " +total_amount);
	}

}
