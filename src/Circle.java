
public class Circle {
    private static void main (String[] args) {

    }
    private double radius;

    private double getRadius(){
        return radius;
    }
    private void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(double radius) {
        return (Math.PI+radius*radius);
    }
    static double getPerimeter(double radius){
            return (2*Math.PI*radius);
    }
}
