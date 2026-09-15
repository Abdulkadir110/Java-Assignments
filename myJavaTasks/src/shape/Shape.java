package shape;

public class Shape {
    public double area(){
        return 0.0;
    }
    public String describe(){
        return "This shape has an area of " + area() ;
    }
}
class Circle extends Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double width;
    private double height;
    Rectangle(double width , double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double area(){
        return width * height;
    }
}
