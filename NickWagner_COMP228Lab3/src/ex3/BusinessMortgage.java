package ex3;

public class BusinessMortgage extends Mortgage {
    public BusinessMortgage(String mortgageNumber, String customerName,
                            double amount, double primeRate, int term) {
        super (mortgageNumber, customerName, amount, primeRate + 1.0, term);
    }
}
