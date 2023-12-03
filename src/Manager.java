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
        System.out.println("We have a new Employee: "+this.getName()+", a manager.");
    }
    //Manager: name, birthYear, nbClients, nbTravelDays, rate
    public Manager(String name, int birthYear, int nbClients, int nbTravelDays) {
        super(name, birthYear);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
        System.out.println("We have a new Employee: "+this.getName()+", a manager.");
    }

    // Vehicle constructors
    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, Vehicle empcar) {
        super(name, birthYear, empcar);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
        System.out.println("We have a new Employee: "+this.getName()+", a manager.");
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, double rate, Vehicle empcar) {
        super(name, birthYear, rate, empcar);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
        System.out.println("We have a new Employee: "+this.getName()+", a manager.");
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
        return super.toString().replace("vanishingposition","Manager")+
                " He/She travelled "+this.getNbTravelDays()+" days and\n" +
                "has brought "+this.getNbClients()+" new clients."+
                "\nHis/Her estimated annual income is "+this.annualIncome();
    }

    @Override
    public String contractInfo() {
        return super.contractInfo().replace("vanishingposition","manager");
    }

}
