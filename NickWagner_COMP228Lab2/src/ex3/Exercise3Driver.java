package ex3;

import java.util.Scanner;

public class Exercise3Driver {
    public static void main(String args[]) {
        Exercise3 sum = new Exercise3();

        int result1 = sum.squareSum(5);
        int result2 = sum.squareSum(3, 6);
        int result3 = sum.squareSum(new int[] {2,3,4});

        System.out.println("squaredSum(5) = " + result1);
        System.out.println("squaredSum(3,6) = " + result2);
        System.out.println("squaredSum({2,3,4}) = " + result3);
    }
}
