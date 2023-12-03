import java.time.Year;

public class Employee {
    //Properties
    private String name;
    private int age;
    private int birthYear;
    private double salary = 0.0;
    private double rate = 100;
    private Vehicle EmpVehicle;

    private Contract currentContract;

    // Methods

    public Employee(String name, int birthYear, double salary, double rate) {
        int curr_year = Year.now().getValue();
        this.name = name;
        this.age = curr_year-birthYear;
        this.birthYear = birthYear;
        this.salary = salary;
        if (!(rate > 100)) {
            this.rate = !(rate < 10) ? rate : 10;
        }
    }

    public Employee(String name, int birthYear, double rate) {
        int curr_year = Year.now().getValue();
        this.name = name;
        this.age = curr_year-birthYear;
        this.birthYear = birthYear;
        if (!(rate > 100)) {
            this.rate = !(rate < 10) ? rate : 10;
        }
    }

    public Employee(String name, int birthYear) {
        int curr_year = Year.now().getValue();
        this.name = name;
        this.age = curr_year-birthYear;
        this.birthYear = birthYear;
    }

    // Vehicle constructors
    public Employee(String name, int birthYear, Vehicle empcar) {
        int curr_year = Year.now().getValue();
        this.name = name;
        this.age = curr_year-birthYear;
        this.birthYear = birthYear;
        this.EmpVehicle = empcar;
    }

    public Employee(String name, int birthYear, double rate, Vehicle empVehicle) {
        int curr_year = Year.now().getValue();
        this.name = name;
        this.age = curr_year-birthYear;
        this.birthYear = birthYear;
        if (!(rate > 100)) {
            this.rate = !(rate < 10) ? rate : 10;
        }
        EmpVehicle = empVehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Vehicle getEmpVehicle() {
        return EmpVehicle;
    }

    public void setEmpVehicle(Vehicle empVehicle) {
        EmpVehicle = empVehicle;
    }

    public Contract getCurrentContract() {
        return currentContract;
    }

    public void setCurrentContract(Contract currentContract) {
        this.currentContract = currentContract;
    }

    // Annual Salary Method
    public double annualIncome(){
        return ((12 * this.getSalary())*this.getRate());
    }

    // To String Method
    @Override
    public String toString() {
        return "Name: "+this.getName()+", a vanishingposition \n"+
                "Age: "+this.getAge()+"\n"+
                this.getEmpVehicle().toString()+
                this.getName() +" has an occupation rate: "+this.getRate()+"% ";
    }


    public void signContract(Contract p1) {
        this.setCurrentContract(p1);
        this.salary = this.currentContract.accumulatedSalary();
    }

    public String contractInfo() {
        return this.getName()+" is a vanishingposition."+this.getCurrentContract().toString();
    }
}
