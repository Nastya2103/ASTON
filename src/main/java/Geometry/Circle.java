package Geometry;

public class Circle implements Figure {
    private double radius;
    private String colorBackground;
    private String colorBorders;

    public Circle(double radius, String colorBackground, String colorBorders) {
        this.radius = radius;
        this.colorBackground = colorBackground;
        this.colorBorders = colorBorders;
    }

    @Override
    public double checkPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public double checkArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Круг: " + "Периметр = " + checkPerimeter() + ". Площадь = " + checkArea() + ". Цвет фона - " + colorBackground + ". Цвет границ - " + colorBorders;
    }
}
