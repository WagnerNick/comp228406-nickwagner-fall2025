package ex1;

import javax.swing.JOptionPane;

public class Life extends Insurance {

    public Life() {super("Life");}

    @Override
    public void setInsuranceCost(double cost) {
        monthlyCost = cost;
    }

    @Override
    public void displayInfo() {
        JOptionPane.showMessageDialog(null,
                "Insurance Type: " + getType() +
                "\nMonthly Cost: $" + String.format("%.2f", getMonthlyCost()));
    }
}
