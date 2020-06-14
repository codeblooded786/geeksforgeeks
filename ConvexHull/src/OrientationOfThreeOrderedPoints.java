/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 08/06/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class OrientationOfThreeOrderedPoints {

    public static int crossProduct(Point p1, Point p2, Point p3) {
        int x = (p2.y - p1.y) * (p3.x - p2.x) - (p3.y - p2.y) * (p2.x - p1.x);
        return x == 0 ? 0 : x < 0 ? -1 : 1;
    }

    public static void main(String args[]) {

        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 4);
        Point p3 = new Point(1, 1);

        int x = crossProduct(p1, p2, p3);

        if (x == 0)
            System.out.println("Collinear");
        else if (x == -1)
            System.out.println("Anticlockwise");
        else
            System.out.println("Clockwise");

    }
}
