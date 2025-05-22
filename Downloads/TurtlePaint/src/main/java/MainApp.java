import java.awt.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class MainApp {

    public static String prompt(String message, String defaultValue) {
        Scanner scanner = new Scanner(System.in);
        String name = " ";
        System.out.printf("%s (%s):", message, defaultValue);
        name = scanner.nextLine();
        if (name.trim().isEmpty()) {
            name = defaultValue;
        }
        return name;
    }

    public static int promptInt(String message, Integer defaultValue) {
        Integer i = null;
        while (i == null) {
            String text = prompt(message, defaultValue.toString());
            try {
                i = Integer.parseInt(text);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        return i;
    }

    public static void add() {
        System.out.println("ADDING....");

    }

    public static void save() {
        System.out.println("SAVING....");
    }


    public static void mainMenu() {
        int choice=-1;
        while (choice!=0){
            System.out.println("""
                1) Add
                2) Save
                0) Exit
                """);

            choice = promptInt("Enter Choice", 1);
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 2:
                    save();
                    break;
                default:
                    add();
            }


        }

    }


    public static void main(String[] args) {
        // This starter code to get you familiar with how
        // the TurtleLogo application works


        //prompt for size of the screen
        int size = promptInt("Size", 400);


        // The world is your canvas
        World world = new World(size, size);
        Turtle turtle = new Turtle(world, size * -0.5, size * -0.5);

        mainMenu();


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
//        var list = Stream.of(
//                new Square(turtle, -100, 0, "GREEN", 6, 100),
//                new Triangle(turtle, 0, 0, "BLACK", 6, 100),
//                new Circle(turtle, 100, 0, "RED", 6, 100)
//        );
//
//        list.forEach(Shape::draw);


    }
}
