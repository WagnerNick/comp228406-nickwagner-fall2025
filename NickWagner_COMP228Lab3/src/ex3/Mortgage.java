package ex3;

public abstract class Mortgage implements MortgageConstants {
    protected String mortgageNumber;
    protected String customerName;
    protected double amount;
    protected double interestRate;
    protected int term;

    public Mortgage(String mortgageNumber, String customerName, double amount, double interestRate, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;

        if (amount > MAX_AMOUNT) {
            this.amount = MAX_AMOUNT;
        } else {
            this.amount = amount;
        }

        if (term == SHORT_TERM || term == MEDIUM_TERM || term == LONG_TERM) {
            this.term = term;
        } else {
            this.term = SHORT_TERM;
        }

        this.interestRate = interestRate;
    }

    public String getMortgageInfo() {
        double totalOwed = amount + (amount * (interestRate / 100) * term);
        return "Bank: " + BANK_NAME + "\nMortgage Number: " + mortgageNumber +
                "\nCustomer: " + customerName + "\nAmount: $" + String.format("%.2f", amount) +
                "\nInterest Rate: " + interestRate + "%" + "\nTerm: " + term +
                " years" + "\nTotal Amount Owed: $" + String.format("%.2f", totalOwed);
    }
}
