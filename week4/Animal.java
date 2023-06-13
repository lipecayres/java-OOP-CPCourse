public class Animal {
    private String name;
    private double topSpeed;

    // default constructor
    public Animal() {
    };

    public Animal(String name, double topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }

    // getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

}