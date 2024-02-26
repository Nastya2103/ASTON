package Animals;

public class Plate {
    private int food;


    public Plate (int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int p) {
        food -= p;
    }

    void increaseFood() {
        this.food += 50;
        System.out.println("В миску добавили 50 грамм корма.");
    }
    boolean checkFood(int p) {
        return (food - p) >= 0;
    }
}
