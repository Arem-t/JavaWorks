package lab3;

public class Circle extends Shape {



    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "work3.Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    protected double radius;
    Circle(){}
    Circle(double radius){this.radius=radius;}

    Circle(double radius,String color,boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
