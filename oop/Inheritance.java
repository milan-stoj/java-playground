
class Inheritance {

    // inheritance, inversion of control.
    public static void main(String[] args) {
        Engine engine = new Ford6CylEngine();

        Vehicle car = new Vehicle(engine);

        car.getEngine().start();
        car.getEngine().printDetails();
        car.getEngine().kill();
        car.getEngine().changeOil();

        Engine newEngine = new Bugatti12Cylinder();
        car.swapEngine(newEngine);

        car.getEngine().start();
        car.getEngine().printDetails();
        car.getEngine().kill();
        car.getEngine().changeOil();

    }
}

interface Startable {

    void start();

    void kill();
}

interface Maintainable {

    void changeOil();
}

// Multiple inheritance
interface Engine extends Startable, Maintainable {

    boolean isRunning();

    String getBrand();

    void printDetails();
}

// Single-level inheritance
abstract class CarEngine implements Engine {

    private int cylinders;
    private boolean running;
}

// Multilevel inheritance
class Bugatti12Cylinder extends CarEngine {

    private boolean isRunning;
    private String brand;
    private int cylinderCount;

    public Bugatti12Cylinder() {
        isRunning = false;
        brand = "Bugatti";
        cylinderCount = 12;
    }

    @java.lang.Override
    public boolean isRunning() {
        return isRunning;
    }

    @java.lang.Override
    public String getBrand() {
        return brand;
    }

    @java.lang.Override
    public void printDetails() {
        System.out.println(String.format("Brand: %s\nRunning: %s\nCylindrers: %d", brand, isRunning, cylinderCount));
    }

    @java.lang.Override
    public void start() {
        isRunning = true;
    }

    @java.lang.Override
    public void kill() {
        isRunning = false;
    }

    @java.lang.Override
    public void changeOil() {
        System.out.println("Oil changed!");
    }
}

class Ford6CylEngine extends CarEngine {

    private boolean isRunning;
    private String brand;
    private int cylinderCount;

    public Ford6CylEngine() {
        isRunning = false;
        brand = "Ford";
        cylinderCount = 6;
    }

    @java.lang.Override
    public boolean isRunning() {
        return isRunning;
    }

    @java.lang.Override
    public String getBrand() {
        return brand;
    }

    @java.lang.Override
    public void printDetails() {
        System.out.println(String.format("Brand: %s\nRunning: %s\nCylindrers: %d", brand, isRunning, cylinderCount));
    }

    @java.lang.Override
    public void start() {
        isRunning = true;
    }

    @java.lang.Override
    public void kill() {
        isRunning = false;
    }

    @java.lang.Override
    public void changeOil() {
        System.out.println("Oil changed!");
    }
}

class Vehicle {

    private Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void swapEngine(Engine engine) {
        this.engine = engine;
    }
}
