import java.util.Vector;

/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 28/06/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class JarvisMarch {

    public static void convexHull(Point[] points, int n) {
        if (n < 3)
            return;

        Vector<Point> hull = new Vector<>();

        int l = 0;

        for (int i = 1; i < n; i++) {
            if (points[i].x < points[l].x)
                l = i;
        }

        int p = l, q;

        do {

            hull.add(points[p]);

            q = (p + 1) % n;

            for (int i = 0; i < n; i++) {
                if (TwoLineSegmentIntersection.orientation(points[p], points[i], points[q]) == -1)
                    q = i;
            }

            p = q;

        } while (p != l);

        for (int i = 0; i < hull.size(); i++)
            System.out.println("(" + hull.get(i).x + "," + hull.get(i).y + ")");
    }


    public static void main(String args[]) {
        Point[] points = new Point[7];

        points[0] = new Point(0, 3);
        points[1] = new Point(2, 3);
        points[2] = new Point(1, 1);
        points[3] = new Point(2, 1);
        points[4] = new Point(3, 0);
        points[5] = new Point(0, 0);
        points[6] = new Point(3, 3);

        int n = points.length;
        convexHull(points, n);

    }


}
