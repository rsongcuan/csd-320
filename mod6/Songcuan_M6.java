// Ryan Songcuan
// 11/21/21
// Module 6 Assignment
// The purpose of this program is to use nested for loops to display the numbers in a pyramid format.
package M6;

public class Songcuan_M6 {
    public static void main(String [] args){
        int row;
        int column;
        int space;
        for(row = 1;  row <= 7; ++row){
            int cont = 1;
            for(space = 7; space > row; --space){
                System.out.print("  ");
            }
            for(column = 1; column <= row; column++){
                System.out.print(cont + " ");
                cont = cont * 2;
            }
            cont = cont / 2;
            for(column = row-1; column >= 1; column--){
                System.out.print(column + " ");
                cont = cont / 2;
            }
            for(space = 9; space > row; --space){
                System.out.print("  ");
            }
            System.out.print("@");
            System.out.println();
        }
    }
}
