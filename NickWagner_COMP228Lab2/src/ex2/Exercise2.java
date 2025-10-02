package ex2;

import javax.swing.*;
import java.util.Random;

public class Exercise2 {
    private int[] numbers;
    private Random rand = new Random();

    public Exercise2() {
        numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(9) + 1;
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void playGame() {
        int userNumber = getUserNumber();
        boolean userWon = false;

        for (int attempt = 1; attempt <= 5; attempt++) {
            Exercise2 lotto = new Exercise2();
            int[] nums = lotto.getNumbers();
            int sum = nums[0] + nums[1] + nums[2];

            JOptionPane.showMessageDialog(null, "Attempt " + attempt + ":\nNumbers = "
                    + nums[0] + ", " + nums[1] + ", " + nums[2] + "\nSum = " + sum);

            if (sum == userNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations! You won!");
                userWon = true;
                break;
            }
        }

        if (!userWon) {
            JOptionPane.showMessageDialog(null, "You lost");
        }
    }

    private int getUserNumber() {
        int number = -1;
        boolean valid = false;

        while (!valid) {
            try {
                String input = JOptionPane.showInputDialog("Enter a number between 3 and 27:");

                if (input == null){
                    JOptionPane.showMessageDialog(null, "Game cancelled.");
                    System.exit(0);
                }

                number = Integer.parseInt(input);

                if (number >= 3 && number <= 27) {
                    valid = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid number. Please enter a number between 3 and 27.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid number. Please enter a valid number.");
            }
        }
        return number;
    }
}
