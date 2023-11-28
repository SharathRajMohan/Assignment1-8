public class Tester extends Employee{
    //Properties
    private int nbBugs;
    //Methods
    // Tester: name, birthYear, nbBugs, rate

    public Tester(String name, int birthYear, double rate, int nbBugs) {
        super(name, birthYear, rate);
        this.nbBugs = nbBugs;
    }

    public int getNbBugs() {
        return nbBugs;
    }

    public void setNbBugs(int nbBugs) {
        this.nbBugs = nbBugs;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "\nEmployee Details=" + super.toString() +
                "\nnbBugs=" + nbBugs +
                "\n}";
    }
}
