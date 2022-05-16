package JAVAPACK;

import java.lang.Math;

public class Sphere extends Shape implements Spatial {
    double radius;

    void setradius(Double r) {
        radius = r;
    }

    public double area() {
        return (4 * Math.PI * radius * radius);
    }

    public double volume() {
        return ((4 * Math.PI * radius * radius * radius) / 3);
    }

}
