package lab3;

public abstract class Shape {
    public Shape(String color, boolean filled){}
    public Shape(){}
    protected String color;
    protected boolean filled;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "work3.Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

