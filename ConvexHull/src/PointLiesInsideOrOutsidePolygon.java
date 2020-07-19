/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 19/07/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class PointLiesInsideOrOutsidePolygon {

    static int INF = 10000;

    public static boolean isInside(Point polygon[], int n, Point p) {
        if (n < 3)
            return false;
        Point extreme = new Point(INF, p.y);

        int count = 0, i = 0, next;

        do {
            next = (i + 1) % n;

            if (TwoLineSegmentIntersection.doIntersect(polygon[i], polygon[next], p, extreme)) {
                if (TwoLineSegmentIntersection.orientation(polygon[i], p, polygon[next]) == 0)
                    return TwoLineSegmentIntersection.onSegment(polygon[i], p, polygon[next]);
                count++;
            }
            i = next;

        } while (i != 0);

        return count % 2 == 1;
    }

    public static void main(String args[]) {
        /*Point polygon[] = {
                new Point(0, 0),
                new Point(10, 10),
                new Point(0, 10),
                new Point(10, 0)
        };*/

        /*Point polygon[] = {
                new Point(0, 0),
                new Point(10, 0),
                new Point(10, 10),
                new Point(0, 10)
        };*/

        /*Point polygon[] = {
                new Point(-13, 0),
                new Point(12, 0),
                new Point(0, 12),
                new Point(0, -11)
        };*/
        Point polygon[] = {
                new Point(1, -1),
                new Point(0, 0),
                new Point(-1, -2)
        };
        boolean inOrOut = isInside(polygon, polygon.length, new Point(0, -1)) ? Boolean.TRUE : Boolean.FALSE;

        System.out.println(inOrOut);

    }


}
