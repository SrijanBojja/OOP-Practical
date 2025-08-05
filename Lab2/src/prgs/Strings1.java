package prgs;
import java.util.Scanner;
public class Strings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input String: ");
		Scanner str = new Scanner(System.in);
		String input = str.nextLine();
		
		System.out.println("Length of String:" +input.length());
		
		char word = input.charAt(3);
		System.out.println("Character at 3:" +word);
		
		String toUpperCase = input.toUpperCase();
		System.out.println("Uppercase: " +toUpperCase);
		
		String toLowerCase = input.toLowerCase();
		System.out.println("Lowercase: " +toLowerCase);
		
		String Substring = input.substring(0, 3);
		System.out.println("Substring: " +Substring);
		
		System.out.println("Give input to search: ");
		Scanner cont = new Scanner(System.in);
		String contain = cont.nextLine();
		boolean Contains = input.contains(contain);
		System.out.println("Contain: " +Contains);
	}
}