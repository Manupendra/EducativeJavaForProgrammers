public class Vehicle implements Comparable<Vehicle> {
    String brand;
    Integer makeYear;

    public Vehicle(String brand, Integer makeYear) {
        super();
        this.brand = brand;
        this.makeYear = makeYear;
    }

    @Override
    public int compareTo(Vehicle o) {
        return this.makeYear - o.makeYear;
    }
}
