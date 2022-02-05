import point2D.Circle2D;
import point2D.Point2D;

import static point2D.Point2D.*;

public class Main {
    public static void main(String[] args) {
        Point2D a = new Point2D(11,6); // create first point
        Point2D b = new Point2D(11,6); // create second point

        System.out.println(a.getDetails());
        System.out.println(b.getDetails());
        boolean isequal = a.isEqual(b); //Used to check whether two points are equal or not.
        System.out.println(isequal);

        Circle2D c1 = new Circle2D(3,4,5); // create first point
        Circle2D c2 = new Circle2D(14,15,8); // create second point

        System.out.println(c1.getPerimeter());
        System.out.println(c2.getPerimeter());
        boolean areOverlapped = c1.overlaps(c2); //Used to check whether two points are equal or not.
        System.out.println(areOverlapped);

    }
}

