package algorithm_4_edition.ex1_2;

/**
 * @author bvvy
 * @date 2018/5/29
 */
public class Ex1_2_1 {

    class Point2D {
        private double x;
        private double y;

        public Point2D(double x, double y) {
            this.x = x;
            this.y = y;
        }

        double distance(Point2D point) {
            return Math.sqrt((point.x - this.x) * (point.x - this.x) + (point.y - this.y) * (point.y - this.y));
        }

    }

    public static void main(String[] args) {
    }

}
