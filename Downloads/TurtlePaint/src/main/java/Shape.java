import java.awt.*;

abstract class Shape implements IDrawable {
    protected Turtle turtle;
    protected int xPostion;
    protected int yPostion;
    protected String colorName;
    protected int borderWidth;


    public void draw() {
        setColor();
        turtle.penUp();
        turtle.goTo(xPostion, yPostion);
        //reset everytime we draw
        turtle.setHeading(0);
        turtle.setPenWidth(borderWidth);
        turtle.penDown();

    }

    public Shape(Turtle turtle, int xPostion, int yPostion, String colorName, int borderWidth) {
        this.turtle = turtle;
        this.xPostion = xPostion;
        this.yPostion = yPostion;
        this.colorName = colorName;
        this.borderWidth = borderWidth;
    }

    protected void setColor() {
        if (colorName.equalsIgnoreCase("GREEN")) {
            turtle.setColor(Color.GREEN);
        } else if (colorName.equalsIgnoreCase("BLUE")) {
            turtle.setColor(Color.BLUE);
        } else if (colorName.equalsIgnoreCase("MAGENTA")) {
            turtle.setColor(Color.MAGENTA);
        } else if (colorName.equalsIgnoreCase("BLACK")) {
            turtle.setColor(Color.BLACK);
        } else if (colorName.equalsIgnoreCase("RED")) {
            turtle.setColor(Color.RED);
        } else {
            turtle.setColor(Color.BLACK);
        }

    }
}

