package KeThua;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println("Default: " + p1);

        Point p2 = new Point(3.5f, 7.2f);
        System.out.println("Constructor: " + p2);

        p2.setXY(1.1f, 2.2f);
        System.out.println("After setXY: " + p2);

        float[] arr = p2.getXY();
        System.out.println("Array: x = " + arr[0] + " , y = " + arr[1]);
    }
}
