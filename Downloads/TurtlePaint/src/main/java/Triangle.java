import java.awt.*;

public class Triangle extends Shape{
    private int height;
    private int width;

    Triangle(Turtle turtle, int xPostion , int yPostion, String colorName, int borderWidth, int width){
        super( turtle, xPostion , yPostion, colorName,  borderWidth);
        this.width=width;
    }

    @Override
    public void draw(){
        super.draw();


        turtle.turnRight(120);
        turtle.forward(width);

        turtle.turnRight(120);
        turtle.forward(width);

        turtle.turnRight(120);
        turtle.forward(width);

    }
}
