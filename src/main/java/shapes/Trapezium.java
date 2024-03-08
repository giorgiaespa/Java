package shapes;
public class Trapezium implements Shape {
    @Override
    public String draw() {
        return "Trapezium";
    }

    @Override
    public String toString() {
        return draw();
    }
}
