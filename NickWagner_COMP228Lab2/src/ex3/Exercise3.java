package ex3;

public class Exercise3 {
    public static int squareSum(int x) {
        return x * x;
    }
    public static int squareSum(int x, int y) {
        return (x * x)+(y * y);
    }
    public static int squareSum(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n * n;
        }
        return sum;
    }
}
