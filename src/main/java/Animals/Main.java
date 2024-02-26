package Animals;

public class Main {

    private static int TIME = 1;
    public static void main(String[] args) {
        Cat cat1 = new Cat("Пушок", 200,0,35,4);
        Cat cat2 = new Cat("Комок шерсти",130,2, 28,3);
        Cat cat3 = new Cat("Беляш", 95,5, 25, 5);
        Dog dog1 = new Dog("Рекс",450, 10 );
        Dog dog2 = new Dog("Лекс", 500,9);
        Dog dog3 = new Dog("Джерри", 600, 12);

        Plate plate = new Plate(100);

        Animal[] animals = {cat1, cat2,cat3, dog1, dog2, dog3};
        for (Animal animal : animals) {
            animal.printInfo();
        }

        System.out.printf("В состязании участвуют %s собаки и %s кошки. Всего %s животных%n", Dog.getDogCount(), Cat.getCatCount(), (Dog.getDogCount() + Cat.getCatCount()));
        System.out.println("*******************************************************************************************************");
        Cat[] cats = {cat1, cat2, cat3};
        System.out.println("У нас 3 кота: " + cats[0].getName() + ", " + cats[1].getName() + ", " + cats[2].getName() + ". " + "Они хотят есть каждые " + cats[0].getFulnessTime() + ", " + cats[1].getFulnessTime() + ", " + cats[2].getFulnessTime() + " час(а) соответсвенно");
        System.out.println("У котов разный аппетит. На данный момент в миске " + plate.getFood() + " гр. корма. Коты голодны и подходят к миске.");
        do {
            for (Cat i : cats) {
                if (i.getFullness() == 0) {
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + "гр. корма и теперь проголодается через " + (i.getFullness()) + " часа(ов).");
                }
                i.setFullness(i.getFullness() - 1);
            }
            System.out.println("Прошел(ло) " + TIME + " часа(ов). В миске осталось: " + plate.getFood() + "гр. корма.");
            TIME++;
        } while (TIME <= 24);
    }
}