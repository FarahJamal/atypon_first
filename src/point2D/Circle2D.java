package point2D;

public class Circle2D {

    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double distanceFromCenter(double x, double y) {
        double xDiff = (x - this.x) * (x - this.x);
        double yDiff = (y - this.y) * (y - this.y);
        return Math.sqrt(xDiff + yDiff);
    }

    public boolean contains(double x, double y) {
        double distance = distanceFromCenter(x, y);
        return distance < radius;
    }

    public boolean contains(Circle2D aCircle) {
        double distance = distanceFromCenter(aCircle.getX(), aCircle.getY());
        return distance + aCircle.getRadius() < radius;
    }

    public boolean overlaps(Circle2D aCircle) {
        double distance = distanceFromCenter(aCircle.getX(), aCircle.getY());
        return distance < radius + aCircle.getRadius();

    }

}