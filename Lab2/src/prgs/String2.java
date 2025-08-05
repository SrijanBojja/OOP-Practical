package prgs;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input String 1: ");
		Scanner str1 = new Scanner(System.in);
		String Strinput1 = str1.nextLine();
		
		System.out.println("Input String 2: ");
		Scanner str2 = new Scanner(System.in);
		String Strinput2 = str2.nextLine();
		
		boolean equal = Strinput1.equals(Strinput2);
		System.out.println("Equals: " +equal);
		
		if(Strinput1 == Strinput2) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
	}
}
