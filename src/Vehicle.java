public class Vehicle {
    String make;
    String plate;
    String color;
    VehicleType category = VehicleType.Family;

    public Vehicle(String make, String plate, String color, VehicleType category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleType getCategory() {
        return category;
    }

    public void setCategory(VehicleType category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "\t- make: "+this.getMake()+"\n" +
                "\t- plate: "+this.getPlate()+"\n" +
                "\t- color: "+this.getColor()+"\n" +
                "\t- category: "+this.getCategory()+"\n";
    }
}
