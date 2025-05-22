import java.awt.*;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(400, 400);
        Turtle turtle = new Turtle(world, -100, -100);

//       //Xshape
//       Shape s1= new XShape(turtle, -200,0,"GREEN", 6,100,100);
//       s1.draw();

        //Sqaure
//        Shape s2 = new Square(turtle, -100, 0, "GREEN", 6, 100);
//        s2.draw();
//
//        //Trangle
//        Shape s3 = new Triangle(turtle, 0, 0, "BLACK", 6, 100);
//        s3.draw();
//
//        //Circle
//        Shape s4 = new Circle(turtle, 100, 0, "RED", 6, 100);
//        s4.draw();

        //Better way to do the above
        var list = Stream.of(
                new Square(turtle, -100, 0, "GREEN", 6, 100),
                new Triangle(turtle, 0, 0, "BLACK", 6, 100),
                new Circle(turtle, 100, 0, "RED", 6, 100)
        );

        list.forEach(Shape::draw);



    }
}
