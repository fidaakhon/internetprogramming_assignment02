package AssignmentNo2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList shapeList = new LinkedList();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int shapeType = random.nextInt(3);
            Shape shape;
            switch (shapeType) {
                case 0:
                    shape = new Square();
                    break;
                case 1:
                    shape = new Rectangle();
                    break;
                case 2:
                    shape = new Triangle();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + shapeType);
            }
            shapeList.insert(shape);
        }

        shapeList.displayShapes();
    }
}
