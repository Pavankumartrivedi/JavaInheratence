package JAVAPACK;

public class Triangle extends Shape {
    double base;
    double heigth;

    public void setbase(double base) {
        this.base = base;
    }

    public void setheigth(double height) {
        this.heigth = height;
    }

    public double area() {
        return (1 * base * heigth / 2);
    }

    public double volume() {
        return -1;
    }

}
