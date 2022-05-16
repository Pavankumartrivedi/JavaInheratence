package JAVAPACK;

public class Rectangle extends Shape {
    double length;
    double width;

    void setlength(double l) {
        length = l;
    }

    void setwidth(double w) {
        width = w;
    }

    public double area() {
        return length * width;

    }

    public double volume() {
        return -1;
    }
}
