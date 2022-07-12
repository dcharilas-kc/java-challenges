package part3;

import java.awt.Point;

public class LineSegment{

    private Point startPoint;
    private Point endPoint;

    public LineSegment(Point startPoint, Point endPoint){
        startPoint = startPoint;
        endPoint = endPoint;
    }

    public double getLength(){
        double distance = Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2) + Math.pow(endPoint.getY() - startPoint.getY(), 2));
        return distance;
    }

    public static void main(String[] args){
        Point pointOne = new Point(1, 2);
        Point pointTwo = new Point(100, 200);
        LineSegment line = new LineSegment(pointOne, pointTwo);
        System.out.println("Length: " + line.getLength());
    }
}