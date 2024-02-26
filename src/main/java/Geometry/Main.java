package Geometry;

public class Main {
    public static void main(String[] args) {
        Figure circle1 = new Circle(5,"красный","синий");
        Figure rectangle1 = new Rectangle(7,5,"зеленый", "желтый");
        Figure triangle1 = new Triangle(4,7,8, "розовый", "голубой");

        System.out.println(circle1);
        System.out.println(rectangle1);
        System.out.println(triangle1);
    }
}
