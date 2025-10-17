package ex1;

import javax.swing.JOptionPane;

public class Exercise1Driver {
    public static void main(String[] args) {
        int num =  Integer.parseInt(JOptionPane.showInputDialog(
                "How many insurance policies would you like to create?"));

        Insurance[] insurances = new Insurance[num];

        for (int i = 0; i < num; i++) {
            String type = JOptionPane.showInputDialog(
                    "Enter type of insurance: ").toLowerCase();
            double cost = Double.parseDouble(JOptionPane.showInputDialog(
                    "Enter monthly cost for insurance:"));

            if (type.equals("life")) {
                insurances[i] = new Life();
            } else if (type.equals("health")) {
                insurances[i] = new Health();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Invalid type, defaulting to Health");
                insurances[i] = new Health();
            }

            insurances[i].setInsuranceCost(cost);
        }

        JOptionPane.showMessageDialog(null, "Displaying All Insurance Policies");
        for (Insurance insurance : insurances) {
            insurance.displayInfo();
        }
    }
}
