package ex2;

public abstract class GameTester {
    protected String name;
    protected  boolean fullTime;

    public GameTester(String name, boolean fullTime) {
        this.name = name;
        this.fullTime = fullTime;
    }

    public String getName() { return name; }
    public boolean isFullTime() { return fullTime; }

    public abstract double determineSalary();

    @Override
    public String toString() {
        return "Game Tester: " + name +
                "\nStatus: " + (fullTime ? "Full-Time" : "Part-Time");
    }
}
