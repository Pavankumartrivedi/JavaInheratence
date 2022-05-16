package JAVAPACK;

public class Cube extends Shape implements Spatial {
    double length;
    double width;
    double height;

    void setlength(double l) {
        length = l;
    }

    void setwidth(double w) {
        width = w;
    }

    void setheigth(double h) {
        height = h;
    }

    public double area() {
        return (2 * length * width + 2 * length * height + 2 * width * height);

    }

    public double volume() {
        return (length * width * height);
    }
}
