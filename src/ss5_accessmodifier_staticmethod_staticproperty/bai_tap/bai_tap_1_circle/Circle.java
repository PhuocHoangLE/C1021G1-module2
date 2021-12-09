package ss5_accessmodifier_staticmethod_staticproperty.bai_tap.bai_tap_1_circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
