// Ryan Songcuan
// 12/1/21
// Module 9 Assignment
package M9;

public class Songcuan_M9 {
    public static void main(String[] args) {
	int[] myList = new int[20];
        fill(myList);
        highest(myList);
        lowest(myList);
        sum(myList);
    }
        
    public static void fill(int[] myList) {   
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter " + myList.length + " integers: ");
        for (int i = 0; i < myList.length; i++)
            myList[i] = input.nextInt();
    }
    
    public static void highest(int[] myList) {
        int highest = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > highest) highest = myList[i];
        }
        System.out.println("The highest value entered is " + highest + ".");
    }
     
    public static void lowest(int[] myList) {
        int lowest = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] < lowest) lowest = myList[i];
        }
        System.out.println("The lowest value entered is " + lowest + ".");
    }

    public static void sum(int[] myList) {
        int sum = 0;
        for (int i = 0; i < myList.length; i++) {
            sum += myList[i];
        }
        int average = sum / 20;
        System.out.println("The average of the numbers entered is " + average + ".");
        System.out.println("The sum of the numbers entered is " + sum + ".");
    }
}