package Labprogram;

import java.util.Scanner;

interface Resizeable {
    void resize(double factor);
}

class Rectangle implements Resizeable {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void resize(double factor) {
        length *= factor;
        width *= factor;
    }

    public void display() {
        System.out.println("Rectangle [Length: " + length + ", Width: " + width + "]");
    }
}

public class RectangleDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);

        System.out.println("Initial dimensions of the rectangle:");
        rectangle.display();

        System.out.print("Enter the resize factor (e.g., 1.5 to increase by 50%): ");
        double factor = scanner.nextDouble();

        rectangle.resize(factor);

        System.out.println("New dimensions of the rectangle after resizing:");
        rectangle.display();

        scanner.close();
    }
}

