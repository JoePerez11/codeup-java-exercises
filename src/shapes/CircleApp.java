package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input myInput = new Input();
        double radius = myInput.getDouble();
        Circle circle1 = new Circle(radius);
        System.out.println("circle1.getCircumference() = " + circle1.getCircumference());
        System.out.println("circle1.getArea() = " + circle1.getArea());
    }
}