public class Tester extends Employee{
    //Properties
    private int nbBugs;
    //Methods
    // Tester: name, birthYear, nbBugs, rate

    public Tester(String name, int birthYear, int nbBugs, double rate) {
        super(name, birthYear, rate);
        this.nbBugs = nbBugs;
    }

    public Tester(String name, int birthYear, int nbBugs, double rate, Vehicle vehicle) {
        super(name, birthYear, rate, vehicle);
        this.nbBugs = nbBugs;
    }

    public int getNbBugs() {
        return nbBugs;
    }

    public void setNbBugs(int nbBugs) {
        this.nbBugs = nbBugs;
    }

    // Override annual income method
    @Override
    public double annualIncome() {
        final double GAIN_FACTOR_ERROR = 10;
        return (super.annualIncome() + (GAIN_FACTOR_ERROR * this.getNbBugs()));
    }

    @Override
    public String toString() {
        return "Tester{" +
                "\nEmployee Details=" + super.toString() +
                "\nnbBugs=" + nbBugs +
                "\n}";
    }
}
