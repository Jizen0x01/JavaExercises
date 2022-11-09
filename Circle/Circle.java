import java.util.Scanner;
import java.math.*;
class Circle{
    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.setRadius(3.0);
        c1.setColor("Black");
        System.out.println(c1.getArea());
        System.out.println(c1.toString());

        Circle c2 = new Circle();
        c2.setRadius(2.0);
        c2.setColor("Blue");
        System.out.println(c2.getCircumference());
        System.out.println(c2.toString());

    }


}
