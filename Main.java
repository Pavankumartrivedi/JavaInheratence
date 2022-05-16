package JAVAPACK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Shape[] shapes = new Shape[5];

            for (int i = 0; i < 5; ++i) {
                String shapeName = scanner.next();
                Shape shape = null;

                switch (shapeName) {
                    case "Triangle": {
                        double base = scanner.nextDouble();
                        double height = scanner.nextDouble();

                        shape = new Triangle();
                        ((Triangle) shape).setbase(base);
                        ((Triangle) shape).setheigth(height);
                        break;
                    }
                    case "Rectangle": {
                        double length = scanner.nextDouble();
                        double width = scanner.nextDouble();

                        shape = new Rectangle();
                        ((Rectangle) shape).setlength(length);
                        ((Rectangle) shape).setlength(width);
                        break;
                    }
                    case "Cube": {
                        double length = scanner.nextDouble();
                        double width = scanner.nextDouble();
                        double height = scanner.nextDouble();

                        shape = new Cube();
                        ((Cube) shape).setlength(length);
                        ((Cube) shape).setlength(width);
                        ((Cube) shape).setheigth(height);
                        break;
                    }
                    case "Sphere": {
                        double radius = scanner.nextDouble();

                        shape = new Sphere();
                        ((Sphere) shape).setradius(radius);
                        break;
                    }
                }

                shapes[i] = shape;
            }

            for (Shape shape : shapes) {
                System.out.println("Area " + shape.area());

                if (shape instanceof Spatial) {
                    double volume = shape.volume();
                    System.out.println("Volume " + volume);
                }
            }
        }
    }
}
