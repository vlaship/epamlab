package by.gsu.epamlab;

public class Passenger implements Cargo {

    private String name;
    private int mass;

    public Passenger() {
        this(null,0);
    }

    public Passenger(String name, int mass) {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public int getMass() {
        return this.mass;
    }

    @Override
    public String toString() {
        return name + ";" + mass;
    }
}
