package shapes;
public class Diamond implements Shape {
    @Override
    public String draw() {
        return "Diamond";
    }

    @Override
    public String toString() {
        return draw();
    }
}
