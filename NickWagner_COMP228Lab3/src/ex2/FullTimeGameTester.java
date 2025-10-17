package ex2;

public class FullTimeGameTester extends GameTester {

    public FullTimeGameTester(String name) {
        super(name, true);
    }

    @Override
    public double determineSalary(){
        return 3000.00;
    }

    @Override
    public String toString(){
        return super.toString() + "\nMonthly Salary: $" +
                String.format("%.2f", determineSalary());
    }
}
