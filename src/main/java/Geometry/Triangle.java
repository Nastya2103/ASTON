package Geometry;

public class Triangle implements Figure{
    private double side1;
    private double side2;
    private double side3;
    private String colorBackground;
    private String colorBorders;

    public Triangle(double side1, double side2, double side3, String colorBackground, String colorBorders) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.colorBackground = colorBackground;
        this.colorBorders = colorBorders;
    }

    public double checkPerimeter() {
        return side1 + side2 + side3;
    }

    public double checkArea() {
        double halfPerimeter = checkPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }

    public String toString() {
        return "Треугольник: " + "Периметр = " + checkPerimeter() + ". Площадь = " + checkArea() + ". Цвет фона - " + colorBackground + ". Цвет границ - " + colorBorders;
    }


}
