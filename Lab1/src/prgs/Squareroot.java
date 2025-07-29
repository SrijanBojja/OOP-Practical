package prgs;
import java.util.Scanner;
public class Squareroot {

	public static void main(String[] args) {
		int i;
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		for(i = 0; i <= n; i++) {
			System.out.println("Square root of : " + i +" is " + Math.sqrt(i));
		}
	}

}