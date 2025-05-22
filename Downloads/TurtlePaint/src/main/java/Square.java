import java.awt.*;

public class Square extends Shape{
    private int height;
    private int width;

    Square(Turtle turtle, int xPostion , int yPostion, String colorName, int borderWidth, int width){
        super( turtle, xPostion , yPostion, colorName,  borderWidth);
        this.width=width;
    }

    @Override
    public void draw(){
        turtle.penUp();
        turtle.goTo(xPostion,yPostion);
        turtle.setPenWidth(borderWidth);
        turtle.penDown();
        turtle.setColor(Color.GREEN);


        turtle.turnRight(90);
        turtle.forward(width);

        turtle.turnRight(90);
        turtle.forward(width);

        turtle.turnRight(90);
        turtle.forward(width);

        turtle.turnRight(90);
        turtle.forward(width);
    }
}
