package PointMovablePoint;

public class TestPointAndMovablePoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(1.0f,2.0f);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(3.0f,4.0f,5.0f,6.0f);
        System.out.println(movablePoint);
    }
}
