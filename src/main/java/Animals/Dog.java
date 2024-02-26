package Animals;

public class Dog extends Animal{

    private final int run;
    private final int swim;
    private static int dogCount;

    public Dog(String name, int distanceRun, int distanceSwim) {
        super(name, distanceSwim, distanceRun);
        this.run = 500;
        this.swim = 10;

        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    public int getRun() {
        if (distanceRun >= run) {
            System.out.printf("%s пробежал %s м.%n", name, distanceRun);
        } if (distanceRun < run) {
            System.out.printf("%s пробежал %s м. (не добежал %s м.)%n", name, distanceRun, (run - distanceRun));
        }
        return run;
    }
    public int getSwim() {
        if (distanceSwim >= swim) {
            System.out.printf("%s проплыл %s м.%n", name, distanceSwim);
        } if (distanceSwim < swim) {
            System.out.printf("%s проплыл %s м. (не доплыл %s м.)%n", name, distanceSwim, (swim - distanceSwim));
        }
        return swim;
    }

    @Override
    public void printInfo() {
        System.out.printf("%s должен пробежать %s м. и проплыть %s м.%n", name, run, swim);
        getRun();
        getSwim();
    }
}
