package point2D;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle2DTest {

    @Test
    void overlaps() {
        Circle2D c1 = new Circle2D(3,4,5); // create first point
        Circle2D c2 = new Circle2D(14,15,8); // create second point
        Circle2D c3 = new Circle2D(2,3,12); // create first point
        Circle2D c4 = new Circle2D(5,9,14); // create second point

        assertEquals(false,c1.overlaps(c2));
        assertEquals(true,c3.overlaps(c4));


    }
}