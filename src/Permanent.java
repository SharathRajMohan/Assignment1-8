public class Permanent implements Contract {
    // Properties:
    private int noDayWorked;
    private double payRate;
    private int noOfChildren;
    private boolean civilStatus;
    private double monthlyPremium;

    // Permanent: nbChildren, married, monthlySalary, bonusPerChildPerMonth, accumulatedDays
    public Permanent( int noOfChildren, boolean civilStatus, double payRate,  double monthlyPremium, int noDayWorked) {
        this.noDayWorked = Math.min(noDayWorked, 20);
        this.payRate = payRate;
        this.noOfChildren = noOfChildren;
        this.civilStatus = civilStatus;
        this.monthlyPremium = monthlyPremium;
    }

    public int getNoDayWorked() {
        return noDayWorked;
    }

    public void setNoDayWorked(int noDayWorked) {
        this.noDayWorked = noDayWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getNoOfChildren() {
        return noOfChildren;
    }

    public void setNoOfChildren(int noOfChildren) {
        this.noOfChildren = noOfChildren;
    }

    public boolean isCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(boolean civilStatus) {
        this.civilStatus = civilStatus;
    }

    public double getMonthlyPremium() {
        return monthlyPremium;
    }

    public void setMonthlyPremium(double monthlyPremium) {
        this.monthlyPremium = monthlyPremium;
    }

    @Override
    public double accumulatedSalary() {
        double bonus = isCivilStatus() ? (this.getNoOfChildren() * this.getMonthlyPremium()) : 0;
        return (this.getNoDayWorked()/20.0)*((this.getPayRate()+bonus));
    }

    @Override
    public String toString() {
        return " he is " + (this.isCivilStatus() ? "" : "not") + " married and has " + this.getNoOfChildren() +
                " children.\nHe/She has worked for " + this.getNoDayWorked() +
                " days and upon contract his/her monthly salary is " + this.getPayRate() + "\n";
    }
}
