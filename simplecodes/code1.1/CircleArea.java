public class CircleArea {
    public void area(double r){
        double  Area= 3.14 *r * r;
        double Perimeter= 2* 3.14 * r;

        System.out.println("Area of Circle  "+ Area);
        System.out.println("circumference of a circle of Circle  "+ Perimeter);

    }
    public static void main(String [] args){
        CircleArea ca=new CircleArea();
        ca.area(7.5);
    }
}
