// Ryan Songcuan
// 12/12/21
// Module 10 Assignment

public class Songcuan_M10 {
    public static void main(String[] args) {
        short[] myShortList = {192, 637, 0, 47, 165, 953, 35, 98};
        System.out.print("The following array contains " + myShortList.length + " short type values: ");
        System.out.print("{");
        for (int i = 0; i < (myShortList.length); i++) {
            if (i < myShortList.length - 1) {
                System.out.print(myShortList[i] + ", ");
            }
            else {
                System.out.println(myShortList[i] + "}");
            }
        }
        System.out.println("The average of these values is " + average(myShortList) + ".");
        System.out.println(" ");

        int[] myIntList = {41, 4, 150, 67, 545, 55, 46, 24, 216, 75};
        System.out.print("The following array contains " + myIntList.length + " integer type values: ");
        System.out.print("{");
        for (int i = 0; i < (myIntList.length); i++) {
            if (i < myIntList.length - 1) {
                System.out.print(myIntList[i] + ", ");
            }
            else {
                System.out.println(myIntList[i] + "}");
            }
        }
        System.out.println("The average of these values is " + average(myIntList) + ".");
        System.out.println(" ");

        long[] myLongList = {100, 139, 28, 167, 87, 922, 304, 537, 349, 23, 254, 324};
        System.out.print("The following array contains " + myLongList.length + " long type values: ");
        System.out.print("{");
        for (int i = 0; i < (myLongList.length); i++) {
            if (i < myLongList.length - 1) {
                System.out.print(myLongList[i] + ", ");
            }
            else {
                System.out.println(myLongList[i] + "}");
            }
        }
        System.out.println("The average of these values is " + average(myLongList) + ".");
        System.out.println(" ");

        double[] myDoubleList = {723.2, 936.4, 776.9, 366.5, 414.3, 13.4, 275.3, 943.4, 737.0, 572.6, 819.8, 75.1, 479.9, 23.2};
        System.out.print("The following array contains " + myDoubleList.length + " double type values: ");
        System.out.print("{");
        for (int i = 0; i < (myDoubleList.length); i++) {
            if (i < myDoubleList.length - 1) {
                System.out.print(myDoubleList[i] + ", ");
            }
            else {
                System.out.println(myDoubleList[i] + "}");
            }
        }
        System.out.println("The average of these values is " + average(myDoubleList) + ".");
    }

    public static short average(short[] array) {
        short average = 0;
        for (short i: array)
            average += i;
        return (short) (average / array.length);
    }

    public static int average(int[] array) {
        int average = 0;
        for (int i: array)
            average += i;
        return average / array.length;
    }

    public static long average(long[] array) {
        long average = 0;
        for (long i: array)
            average += i;
        return (long) (average / array.length);
    }

    public static double average(double[] array) {
        double average = 0;
        for (double i: array)
            average += i;
        return average / array.length;
    }
}
