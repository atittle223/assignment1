package whichone;

import java.util.*;

public class whichone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please print a word!!");
		
		String answer1 = input.nextLine();
		
		System.out.println("ok, your word is " + answer1);
		
		String newString = new StringBuilder(answer1).reverse().toString();
		
		
		
		System.out.println("Your word reversered is " + newString);
		
		System.out.println("Why you " + newString + "ing" + " that!!!");
	}
}
