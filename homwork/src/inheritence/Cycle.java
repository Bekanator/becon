package inheritence;

import inheritence.point.Point;

public class Cycle extends Figure {
    private Point center;
    private double radius;
    private String color;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public Cycle() {
        this.center = new Point();
        this.radius=1.0;
    }

    public Cycle(int xCenter, int yCenter,double radius) {
        center=new Point(xCenter,yCenter);
        this.radius = radius;
    }

    public Cycle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }
    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }
    public String toString(){
        return "Круг [центр="+center+", радиус="+radius+"]";
    }


    public double getArea() {
        return Math.PI*radius*radius;
    }




}
