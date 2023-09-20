package AssignmentNo2;

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public String toString() {
        return "This is a rectangle";
    }
}
