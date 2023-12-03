public class Programmer extends Employee{
    // Properties
    private int nbProjects;


    //Methods
    // Programmer: name, birthYear, nbProjects, rate
    public Programmer(String name, int birthYear, int nbProjects, double rate) {
        super(name, birthYear, rate);
        this.nbProjects = nbProjects;
        System.out.println("We have a new Employee: "+this.getName()+", a programmer.");
    }

    public Programmer(String name, int birthYear, int nbProjects) {
        super(name, birthYear);
        this.nbProjects = nbProjects;
        System.out.println("We have a new Employee: "+this.getName()+", a programmer.");
    }

    public Programmer(String name, int birthYear, int nbProjects, double rate, Vehicle vehicle) {
        super(name, birthYear, rate, vehicle);
        this.nbProjects = nbProjects;
        System.out.println("We have a new Employee: "+this.getName()+", a programmer.");
    }

    public Programmer(String name, int birthYear, int nbProjects, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        this.nbProjects = nbProjects;
        System.out.println("We have a new Employee: "+this.getName()+", a programmer.");
    }

    public int getNbProjects() {
        return nbProjects;
    }
    public void setNbProjects(int nbProjects) {
        this.nbProjects = nbProjects;
    }

    // Override annual income method
    @Override
    public double annualIncome() {
        final double GAIN_FACTOR_PROJECTS = 200;
        return (super.annualIncome() + (GAIN_FACTOR_PROJECTS * this.getNbProjects()));
    }

    @Override
    public String toString() {
        return super.toString().replace("vanishingposition","Programmer")+
                " and completed "+this.getNbProjects()+" projects."+
                "\nHis/Her estimated annual income is "+this.annualIncome();
    }

    @Override
    public String contractInfo() {
        return super.contractInfo().replace("vanishingposition","programmer");
    }
}
