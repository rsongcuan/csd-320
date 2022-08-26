// Ryan Songcuan
// 11/14/21
// Module 5 Assignment
// The purpose of this program is to use a while loop to display the following math operations from largest to smallest and then smallest to largest.
package M5;

public class Songcuan_M5 {
    public static void main(String[] args) {
        int n = 3;
        while (n < 100) {
            if (n < 99){
                System.out.print("1/" + n + " + ");
                n += 2;
            }
            else {
                System.out.println("1/" + n);
                break;
            }
        }
        int i = 99;
        while (i > 2) {
            if (i > 3) {
                System.out.print("1/" + i + " + ");
                i -= 2;
            }
            else {
                System.out.println("1/" + i);
                break;
            }
        }
    }
}
