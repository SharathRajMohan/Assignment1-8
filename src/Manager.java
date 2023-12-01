import java.sql.SQLOutput;

public class Manager extends Employee {
    // Properties
    private int nbTravelDays;
    private int nbClients;

    //Methods

    //Manager: name, birthYear, nbClients, nbTravelDays, rate
    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, double rate) {
        super(name, birthYear, rate);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }
    //Manager: name, birthYear, nbClients, nbTravelDays, rate
    public Manager(String name, int birthYear, int nbClients, int nbTravelDays) {
        super(name, birthYear);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }

    // Vehicle constructors
    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, Vehicle empcar) {
        super(name, birthYear, empcar);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, double rate, Vehicle empcar) {
        super(name, birthYear, rate, empcar);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }

    public int getNbTravelDays() {
        return nbTravelDays;
    }

    public void setNbTravelDays(int nbTravelDays) {
        this.nbTravelDays = nbTravelDays;
    }

    public int getNbClients() {
        return nbClients;
    }

    public void setNbClients(int nbClients) {
        this.nbClients = nbClients;
    }

    // Override annual income method
    @Override
    public double annualIncome() {
        final double  GAIN_FACTOR_CLIENT = 500;
        final double  GAIN_FACTOR_TRAVEL = 100;
        return (super.annualIncome() + (GAIN_FACTOR_CLIENT * this.getNbClients()) + (GAIN_FACTOR_TRAVEL * this.getNbTravelDays()));
    }

    @Override
    public String toString() {
        return "Manager{" +
                "\nEmployee Details=" + super.toString() +
                "\nnbTravelDays=" + nbTravelDays +
                ", nbClients=" + nbClients +
                "\n}";
    }
}
