package Animals;

public class Cat extends Animal{
    private final int run;
    private final int swim;
    private int appetite;
    private int fullness;
    private int fulnessTime;
    private static int catCount = 0;



    public Cat(String name, int distanceRun, int distanceSwim, int appetite, int fulnessTime) {
        super(name, distanceSwim, distanceRun);
        this.run = 200;
        this.swim = 0;
        this.appetite = appetite;
        this.fullness = 0;
        this.fulnessTime = fulnessTime;

        catCount++;
    }

    public int getAppetite() {
        return appetite;
    }

    public int getFullness() {
        return fullness;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public int getFulnessTime() {
        return fulnessTime;
    }
    public static int getCatCount() {
        return catCount;
    }

    public int getRun() {
        if (distanceRun >= run) {
            System.out.printf("%s пробежал %s м.%n", name, distanceRun);
        } if (distanceRun < run) {
            System.out.printf("%s пробежал %s м. (не добежал %s м.)%n", name, distanceRun, (run - distanceRun) );
        }
        return run;
    }
     public int getSwim() {
        if (distanceSwim > swim) {
            System.out.printf("%s потрогал лапкой воду, свалился в воду, потом фыркнул и ушел%n", name, distanceSwim);
        } if (distanceSwim <= swim) {
             System.out.printf("%s не умеет плавать%n", name, (swim - distanceSwim));
        }
        return swim;
     }
     @Override
     public void printInfo() {
        System.out.printf("%s должен пробежать %s м. и проплыть %s м.%n", name, run, swim);
        getRun();
        getSwim();
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
        fullness += fulnessTime;
    }
}
