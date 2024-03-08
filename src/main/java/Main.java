import shapes.Shape;
import shapes.ShapeType;


public class Main {
    public static void main(String[] args) throws Exception {
        ShapeType shapeType = ShapeType.SQUARE;
        Shape whichShape = ShapeFactory.getShape(shapeType);
        System.out.println("Which shape are we dealing with? " + whichShape);

        ShapeType shapeType2 = ShapeType.RECTANGLE;
        Shape whichShape2 = ShapeFactory.getShape(shapeType2);
        System.out.println("Which shape are we dealing with? " + whichShape2);

        ShapeType shapeType3 = ShapeType.DIAMOND;
        Shape whichShape3 = ShapeFactory.getShape(shapeType3);
        System.out.println("Which shape are we dealing with? " + whichShape3);

        ShapeType shapeType4 = ShapeType.SQUARE;
        Shape whichShape4 = ShapeFactory.getShape(shapeType4);
        System.out.println("Which shape are we dealing with? " + whichShape4);
    }
}
