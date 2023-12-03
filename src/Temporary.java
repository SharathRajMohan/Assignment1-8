public class Temporary implements Contract {
    double hourlyPay;
    int hoursWorked;

    public Temporary(double hourlyPay, int hoursWorked) {
        this.hourlyPay = hourlyPay;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double accumulatedSalary() {
        return this.hourlyPay*this.hoursWorked;
    }

    @Override
    public String toString() {
        return " he is a temporary employee with " +
                this.getHourlyPay() +"\n"+
                "hourly salary and he has worked for " +
                this.getHoursWorked() + " hours" + "\n";
    }

}
