public class Main {
        public static void main (String[] args){

            Circle c = new Circle();

            System.out.println("Perimeter is: " + c.getPerimeter(4.0D));
            System.out.println("Area is: " + c.getArea(5.0D));

            double p = c.getPerimeter(5);
            double a = c.getArea(5);

            System.out.println("Perimeter is: " + p);
            System.out.println("Area is: " + a);
        }
    }


