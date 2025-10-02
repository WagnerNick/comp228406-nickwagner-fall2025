package ex1;

import javax.swing.*;
import java.util.Random;

public class Exercise1 {
    private String[] questions = {
            "Q1: Which one of the following symbols indicates a single line comment in Java?",
            "Q2: Which of the following typically groups related classes so that they could be imported into programs and reused?",
            "Q3: Method arguments may be _______?",
            "Q4: Which keyword is used to inherit a class in Java?",
            "Q5: Class variables must be declared as _______?"
    };

    private String[][] options = {
            {"A. //", "B. #!", "C. ||", "D. ##"},
            {"A. Method", "B. IDE", "C. Function", "D. Package"},
            {"A. only strings", "B. only variables", "C. constants, variables, or expressions", "D. only constants"},
            {"A. this", "B. extends", "C. super", "D. implements"},
            {"A. final", "B. static", "C. var", "D. const"}
    };

    private int[] answers = {0, 3, 2, 1, 2};

    public void simulateQuestions(int qIndex) {
        String message = questions[qIndex] + "\n";
        for (String option : options[qIndex]) {
            message += option + "\n";
        }
        JOptionPane.showMessageDialog(null, message);
    }

    public int inputAnswer(int qIndex) {
        String input = JOptionPane.showInputDialog("Enter your answer: ");

        if (input == null) return -1;
        input = input.toUpperCase();

        switch (input) {
            case "A": return 0;
            case "B": return 1;
            case "C": return 2;
            case "D": return 3;
            default: return -1;
        }
    }

    public boolean checkAnswer(int qIndex, int userAnswer) {
        return userAnswer == answers[qIndex];
    }

    private Random rand = new Random();

    public String generateMessage(boolean correct) {
        int choice = rand.nextInt(4);
        if (correct) {
            switch (choice) {
                case 0: return "Excellent!";
                case 1: return "Good!";
                case 2: return "Keep up the good work!";
                case 3: return "Nice work!";
            }
        }  else {
            switch (choice) {
                case 0: return "No. Please try again";
                case 1: return "Wrong. try once more";
                case 2: return "Don't give up!";
                case 3: return "No. Keep trying";
            }
        }
        return "";
    }

    public void startTest() {
        int correct = 0;
        int incorrect = 0;

        for (int i = 0; i < questions.length; i++) {
            simulateQuestions(i);
            int userAnswer = inputAnswer(i);
            if (userAnswer == -1) {
                JOptionPane.showMessageDialog(null, "Invalid Input, skipping question.");
                incorrect++;
                continue;
            }

            if (checkAnswer(i, userAnswer)) {
                correct++;
                JOptionPane.showMessageDialog(null, generateMessage(true));
            } else {
                incorrect++;
                JOptionPane.showMessageDialog(null, generateMessage(false) + "\nCorrect answer: " + options[i][answers[i]]);
            }
        }

        double percentage = (correct * 100.0) / questions.length;
        JOptionPane.showMessageDialog(null,
                "Test finished\nCorrect: " + correct + "\nIncorrect: " + incorrect + "\nScore: " + percentage + "%");
    }
}
