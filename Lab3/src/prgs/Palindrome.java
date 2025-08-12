package prgs;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter input: ");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		
		String lowered = string.toLowerCase();
		
		String reversed = new StringBuilder(lowered).reverse().toString();
		
		if(lowered.equals(reversed)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
