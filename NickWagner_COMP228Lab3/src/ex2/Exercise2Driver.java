package ex2;

import java.util.Scanner;

public class Exercise2Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter tester's name: ");
        String name = input.nextLine();

        System.out.print("Is the tester full-time or part-time? (F/P): ");
        String type = input.nextLine().trim().toUpperCase();

        GameTester tester;

        if (type.equals("F")) {
            tester = new FullTimeGameTester(name);
        } else{
            System.out.println("Enter number of hours worked: ");
            int hours = input.nextInt();
            tester = new PartTimeGameTester(name, hours);
        }

        System.out.print("\n--- Game Tester Information ---");
        System.out.print(tester.toString());

        input.close();
    }
}
