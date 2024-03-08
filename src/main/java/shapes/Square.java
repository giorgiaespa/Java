package shapes;

public class Square implements Shape{
    @Override
    public String draw() {
        return "Square";
    }

    @Override
    public String toString() {
        return draw();
    }
}
