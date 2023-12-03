public class Tester extends Employee{
    //Properties
    private int nbBugs;
    //Methods
    // Tester: name, birthYear, nbBugs, rate

    public Tester(String name, int birthYear, int nbBugs, double rate) {
        super(name, birthYear, rate);
        this.nbBugs = nbBugs;
        System.out.println("We have a new Employee: "+this.getName()+", a tester.");
    }

    public Tester(String name, int birthYear, int nbBugs, double rate, Vehicle vehicle) {
        super(name, birthYear, rate, vehicle);
        this.nbBugs = nbBugs;
        System.out.println("We have a new Employee: "+this.getName()+", a tester.");
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
        return super.toString().replace("vanishingposition","Tester")+
                " and corrected "+ this.getNbBugs() +" bugs." +
                "\nHis/Her estimated annual income is "+this.annualIncome();
    }

    @Override
    public String contractInfo() {
        return super.contractInfo().replace("vanishingposition","tester");
    }

}
