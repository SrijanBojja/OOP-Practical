package prgs;

public class Swapping {

	public static void main(String[] args) {
		int bag1 = 5;
		int bag2 = 3;
		int swap;
		System.out.println("Apples in Bag 1 before swapping: " +bag1);
		System.out.println("Apples in Bag 2 before swapping: " +bag2);
		swap = bag1;
		bag1 = bag2;
		bag2 = swap;
		System.out.println("Apples in Bag 1 After swapping: " +bag1);
		System.out.println("Apples in Bag 2 After swapping: " +bag2);

	}

}
