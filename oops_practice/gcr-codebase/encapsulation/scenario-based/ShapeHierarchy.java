public class ShapeHierarchy{
    public static void main(String[] args){
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4,6);
        shapes[2] = new Triangle(3,4,5);

        for(int i=0;i<shapes.length;i++){
            System.out.println("Shape"+shapes[i].getClass().getSimpleName());
            System.out.println("Area"+shapes[i].area());
            System.out.println("Perimeter"+shapes[i].perimeter());
            System.out.println();
        }

    }
    
}
abstract class Shape{
    abstract double area();
    abstract double perimeter();
}
class Circle extends Shape{
    private double radius;

    Circle(double radius){
        this.radius=radius;
    }
    public double getradius(){
        return radius;
    }
    double area(){
        return Math.PI*radius*radius;
    }
    double perimeter(){
        return 2 * Math.PI * radius;
    }

}
class Rectangle extends Shape{
    private double length;
    private double width;

    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    double area(){
        return length*width;
    }
    double perimeter(){
        return 2*(length+width);
    }
}
class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side2=side3;

    }
    double perimeter(){
        return side1 + side2 + side3;
    }
    double area(){
        double s = perimeter() / 2;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}