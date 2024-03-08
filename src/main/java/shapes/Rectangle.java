package shapes;

public class Rectangle implements Shape{
    @Override
    public String draw() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return draw();
    }
}
