package ex1;

import javax.swing.JOptionPane;

public class Health extends Insurance {

    public Health() {super("Health");}

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
