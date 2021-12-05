package lab3;

public class Rectangle extends Shape{
    double width;
    double length;
    Rectangle(){}

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }


    Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    Rectangle(double width, double length,String color,boolean filled){
        this.color=color;
        this.filled=filled;
        this.width=width;
        this.length=length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "work3.Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

