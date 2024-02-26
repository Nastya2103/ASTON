package Animals;

public abstract class Animal {
    protected String name;
    protected int distanceSwim;
    protected int distanceRun;

    public Animal(String name, int distanceSwim, int distanceRun) {
        this.name = name;
        this.distanceSwim = distanceSwim;
        this.distanceRun = distanceRun;
    }

    public String getName() {
        return name;
    }

    public abstract void printInfo();
}
