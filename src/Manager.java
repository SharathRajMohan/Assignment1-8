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

    @Override
    public String toString() {
        return "Manager{" +
                "\nEmployee Details=" + super.toString() +
                "\nnbTravelDays=" + nbTravelDays +
                ", nbClients=" + nbClients +
                "\n}";
    }
}
