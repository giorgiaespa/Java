import shapes.*;

import static shapes.ShapeType.*;
public class ShapeFactory {
    public static Shape getShape (ShapeType shapeType) throws Exception {
        String shapeName = shapeType.name();
        if (shapeName.equalsIgnoreCase("trapezium")){
            return new Trapezium();
        } else if (shapeName.equalsIgnoreCase("diamond")) {
            return new Diamond();
        } else if (shapeName.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shapeName.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
