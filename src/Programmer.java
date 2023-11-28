public class Programmer extends Employee{
    // Properties
    private int nbProjects;


    //Methods
    // Programmer: name, birthYear, nbProjects, rate


    public Programmer(String name, int birthYear, int nbProjects, double rate) {
        super(name, birthYear, rate);
        this.nbProjects = nbProjects;
    }

    public Programmer(String name, int birthYear, int nbProjects) {
        super(name, birthYear);
        this.nbProjects = nbProjects;
    }

    public int getNbProjects() {
        return nbProjects;
    }

    public void setNbProjects(int nbProjects) {
        this.nbProjects = nbProjects;
    }
    @Override
    public String toString() {
        return "Programmer{" +
                "\nEmployeeDetails"+ super.toString() +
                "\nnbProjects=" + nbProjects +
                "\n}";
    }
}
