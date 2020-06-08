package ru.job4j.oop;

public class TriangleArea {
    private Point first;
    private Point second;
    private Point third;

    public TriangleArea(Point a, Point b, Point c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public double semiPerimeter(double ab, double bc, double ac) {
        return (ab + bc + ac) / 2;
    }

    private boolean exist(double ab, double bc, double ac) {
        boolean result = false;
        if (ab + bc > ac || ab + ac > bc || bc + ac > ab) {
            return true;
        }
        return result;
    }

    public double area() {
        double result = -1;
        double ab = first.distance(second);
        double bc = first.distance(third);
        double ac = second.distance(third);
        double semiPerimeter = semiPerimeter(ab, bc, ac);
        if (this.exist(ab, bc, ac)) {
            result = Math.sqrt(semiPerimeter * (semiPerimeter - ab) * (semiPerimeter - bc) * (semiPerimeter - ac));
        }
        return result;
    }
}
