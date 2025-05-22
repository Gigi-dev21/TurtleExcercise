import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(400, 400);
        Turtle turtle = new Turtle(world,-100, -100);
        
//       Shape s1= new XShape(turtle, 0,0,"GREEN", 6,200,200);
//       s1.draw();

        //Sqaure
//        Shape s2=new Square(turtle, 0,0,"GREEN", 6,100);
//        s2.draw();

        //Trangle
//        Shape s3=new Triangle(turtle, 0,0,"GREEN", 6,100);
//        s3.draw();

        //Circle
        Shape s4=new Circle(turtle, 0,0,"GREEN", 6,100);
        s4.draw();

    }
}
