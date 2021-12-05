package lab3;

public class Square extends Rectangle{
    Square(){}
    Square(double side){this.side=side;}
    Square(double side,String color,boolean filled){
        this.side=side;
        this.color=color;
        this.filled=filled;
    }
    double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "work3.Square{" +
                "side=" + side +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

