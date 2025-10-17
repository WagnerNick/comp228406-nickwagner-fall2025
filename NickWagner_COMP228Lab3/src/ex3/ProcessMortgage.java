package ex3;

import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mortgage[] mortgages = new Mortgage[3];

        System.out.print("Enter the current prime interest rate: ");
        double primeRate = input.nextDouble();
        input.nextLine();

        for(int i = 0; i < mortgages.length; i++){
            System.out.println("\n--- Enter details for mortgage #" + (i+1) + " ---");

            System.out.print("Enter mortgage number: ");
            String number = input.nextLine();

            System.out.print("Enter customer name: ");
            String name = input.nextLine();

            System.out.print("Enter mortgage amount: ");
            double amount = input.nextDouble();

            System.out.print("Enter term (1, 3, or 5 years): ");
            int term = input.nextInt();
            input.nextLine();

            System.out.print("Enter type of mortgage (Business/Personal): ");
            String type = input.nextLine().trim().toLowerCase();

            if (type.equals("business")){
                mortgages[i] = new BusinessMortgage(number, name, amount, primeRate, term);
            } else {
                mortgages[i] = new PersonalMortgage(number, name, amount, primeRate, term);
            }
        }

        System.out.print("\n\n--- Mortgage Information ---");
        for (Mortgage m : mortgages) {
            System.out.println("----------------------");
            System.out.println(m.getMortgageInfo());
        }

        input.close();
    }
}
