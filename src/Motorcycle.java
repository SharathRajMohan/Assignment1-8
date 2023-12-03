public class Motorcycle extends Vehicle {
    // Properties
    private boolean hasSidecar = false;

    // Methods
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
    // Constructor
    public Motorcycle(String make, String plate, String color, VehicleType category, boolean hasSidecar) {
        super(make, plate, color, category);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Employee has a motorcycle\n"+
                super.toString()+ (this.isHasSidecar() ? "\t- with sidecar\n":"\t- without sidecar\n");
    }

}
