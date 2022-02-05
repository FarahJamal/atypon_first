package point2D;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void isEqual() {
        Point2D a = new Point2D(11,6); // create first point
        Point2D b = new Point2D(11,6); // create second point
        Point2D a2 = new Point2D(11,6); // create first point
        Point2D b2 = new Point2D(1,50); // create second point
        assertEquals(true,a.isEqual(b));
        assertEquals(false,a2.isEqual(b2));

    }
}