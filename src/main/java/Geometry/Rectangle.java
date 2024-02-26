package Geometry;

public class Rectangle implements Figure {
    private double width;
    private double height;
    private String colorBackground;
    private String colorBorders;

    public Rectangle(double width, double height, String colorBackground, String colorBorders) {
        this.width = width;
        this.height = height;
        this.colorBackground = colorBackground;
        this.colorBorders = colorBorders;
    }

    public double checkPerimeter() {
        return (width + height) * 2;
    }

    public double checkArea() {
        return width * height;
    }

    public String toString() {
        return "Прямоугольник: " + "Периметр = " + checkPerimeter() + ". Площадь = " + checkArea() + ". Цвет фона - " + colorBackground + ". Цвет границ - " + colorBorders;
    }
}
