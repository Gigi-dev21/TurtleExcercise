import java.awt.*;

public class XShape extends Shape {
    private int height;
    private int width;

    XShape(Turtle turtle, int xPostion, int yPostion, String colorName, int borderWidth, int width, int height) {
        super(turtle, xPostion, yPostion, colorName, borderWidth);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        super.draw();


        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


//        turtle.setPenWidth(3);
        turtle.setColor(Color.GREEN);

        turtle.turnRight(45);
        turtle.forward(hypotenuse);

        turtle.penUp();
        turtle.goTo(width / 2.0, height / 2.0);
        turtle.turnRight(90);

        turtle.penDown();
        turtle.forward(hypotenuse);
    }
}
