// Ryan Songcuan
// 11/7/21
// Module 4 Assignment
// The purpose of this assignment is to check if the user's entered strings are substrings of each other.
package M4;

import java.util.Scanner;

public class Songcuan_M4 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first string: ");
	String s1 = input.nextLine();

	System.out.print("Enter the second string: ");
	String s2 = input.nextLine();

	if (s2.contains(s1)) {
            System.out.println(s1 + " is a substring of " + s2);
        }
	else {
            System.out.println(s1 + " is not a substring of " + s2);
	}

	if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
	}
	else {
            System.out.println(s2 + " is not a substring of " + s1);
	}
    }
}
