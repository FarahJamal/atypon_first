
package point2D;
import java.util.*;
public class Point2D
{
    int x,y;
    public Point2D(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public boolean isEqual(Point2D p)
    {
        if(this.x == p.x && this.y == p.y)
        {
//			System.out.println("Points are equal");
            return true;
        }
        else
        {
//			System.out.println("Points are not equal");
            return false;
        }
    }
    public String getDetails()
    {
        return "Point ("+x+","+y+")";
    }
    public Point2D createNewPoint(int x, int y)
    {
        return new Point2D(this.x + x, this.y + y);
    }
    public double calcDistance(Point2D anotherPoint)
    {
        return Math.sqrt(Math.pow(this.x - anotherPoint.x, 2) + Math.pow(this.y - anotherPoint.y, 2));
    }
    //3.6
    public static Point2D TestPoint()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x-coordinate");
        int x = sc.nextInt();
        System.out.println("Enter y-coordinate");
        int y = sc.nextInt();
        return new Point2D(x,y);
    }
}

