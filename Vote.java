package exception;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) throws AgeException {

		Scanner s = new Scanner(System.in);
		System.out.println("USER NAME");
		String name = s.next();

		System.out.println("ENTER AGE");
		int age = s.nextInt();
		if (age > 18) {
			System.out.println("Eligible to vote");
		} else {
			throw new AgeException("ur not eligble");

		}
		System.out.println("Enter gender:");
		String gender = s.next();
		System.out.println(gender);

		System.out.println("Enter ur Address:");
		String ads = s.next();
		System.out.println(ads);

	}

}
