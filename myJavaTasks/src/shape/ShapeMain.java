package shape;

import java.util.ArrayList;

public class ShapeMain {
    void main(){
        ArrayList<Shape> shapes= new ArrayList<>();
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(7,10);

        shapes.add(circle);
        shapes.add(rectangle);

        for(int index = 0; index < shapes.size(); index++){
            IO.println(shapes.get(index).describe());
        }
    }
}
