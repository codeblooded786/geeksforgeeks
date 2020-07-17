/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 28/06/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */

public class TwoLineSegmentIntersection {


    public static int orientation(Point p, Point q, Point r) {
        int x = (q.y - p.y) * (r.x - q.x) - (r.y - q.y) * (q.x - p.x);
        return x >= 0 ? x > 0 ? 1 : 0 : -1;
    }

    public static boolean onSegment(Point p, Point q, Point r) {
        if (q.x <= Math.max(p.x, r.x) && q.x >= Math.min(p.x, r.x) && q.y <= Math.max(p.y, r.y) && q.y >= Math.max(p.y, r.y))
            return true;
        return false;
    }

    public static boolean doIntersect(Point p1, Point q1, Point p2, Point q2) {

        final int o1 = orientation(p1, q1, p2);
        final int o2 = orientation(p1, q1, q2);
        final int o3 = orientation(p2, q2, p1);
        final int o4 = orientation(p2, q2, q1);

        if (o1 != o2 && o3 != o4)
            return true;

        if (o1 == 0 && onSegment(p1, q1, p2))
            return true;
        if (o2 == 0 && onSegment(p1, q1, q2))
            return true;
        if (o3 == 0 && onSegment(p2, q2, p1))
            return true;
        if (o4 == 0 && onSegment(p2, q2, q1))
            return true;

        return false;
    }

    public static void main(String args[]) {
        Point p1 = new Point(1, 1);
        Point q1 = new Point(10, 1);
        Point p2 = new Point(1, 2);
        Point q2 = new Point(10, 2);

        if (doIntersect(p1, q1, p2, q2))
            System.out.println("Intersect");
        else
            System.out.println("Won't Intersect");

        p1 = new Point(10, 1);
        q1 = new Point(0, 10);
        p2 = new Point(0, 0);
        q2 = new Point(10, 10);

        if (doIntersect(p1, q1, p2, q2))
            System.out.println("Intersect");
        else
            System.out.println("Won't Intersect");

        p1 = new Point(-5, -5);
        q1 = new Point(0, 0);
        p2 = new Point(1, 1);
        q2 = new Point(10, 10);

        if (doIntersect(p1, q1, p2, q2))
            System.out.println("Intersect");
        else
            System.out.println("Won't Intersect");
    }
}