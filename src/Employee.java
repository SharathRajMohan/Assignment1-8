import java.time.Year;

public class Employee {
    //Properties
    private String name;
    private int age;
    private int birthYear;
    private double salary = 0.0;
    private double rate = 100;
    private Vehicle EmpVehicle;

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
        System.out.println("We have a new Employee!");
        System.out.println(this.toString());
    }

    public Employee(String name, int birthYear, double rate) {
        int curr_year = Year.now().getValue();
        this.name = name;
        this.age = curr_year-birthYear;
        this.birthYear = birthYear;
        if(rate>1)
            this.rate = 1.0;
        else this.rate = !(rate < 0.01) ? rate : 0.01;
        System.out.println("We have a new Employee!");
        System.out.println(this.toString());
    }

    public Employee(String name, int birthYear) {
        int curr_year = Year.now().getValue();
        this.name = name;
        this.age = curr_year-birthYear;
        this.birthYear = birthYear;
        System.out.println("We have a new Employee!");
        System.out.println(this.toString());
    }

    // Vehicle constructors
    public Employee(String name, int birthYear, Vehicle empcar) {
        int curr_year = Year.now().getValue();
        this.name = name;
        this.age = curr_year-birthYear;
        this.birthYear = birthYear;
        this.EmpVehicle = empcar;
        System.out.println("We have a new Employee!");
        System.out.println(this.toString());
    }

    public Employee(String name, int birthYear, double rate, Vehicle empVehicle) {
        int curr_year = Year.now().getValue();
        this.name = name;
        this.age = curr_year-birthYear;
        this.birthYear = birthYear;
        this.rate = rate;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthYear=" + birthYear +
                ", salary=" + salary +
                ", rate=" + rate*100 +"%"+
                '}';
    }
}
