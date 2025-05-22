import java.awt.*;

public class Circle extends Shape {
    private int height;
    private int width;

    Circle(Turtle turtle, int xPostion, int yPostion, String colorName, int borderWidth, int width) {
        super(turtle, xPostion, yPostion, colorName, borderWidth);
        this.width = width;
    }

    @Override
    public void draw() {
        turtle.penUp();
        turtle.goTo(xPostion, yPostion);
        turtle.setPenWidth(borderWidth);
        turtle.penDown();
        turtle.setColor(Color.GREEN);

        int sides = 12;
        int angle = 360 / sides;
        int length = (int) (width / Math.PI);

        for (int s = 0; s < sides; s++) {
            turtle.forward(length);
            turtle.turnRight(angle);

        }


    }
}
