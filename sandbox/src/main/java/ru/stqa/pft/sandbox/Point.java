package ru.stqa.pft.sandbox;


public class Point {
    public double x;
    public double y;

    public Point(double x1, double y1) {
        this.x = x1;
        this.y = y1;
    }

    public double distance(Point p){
        return Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
    }

}
