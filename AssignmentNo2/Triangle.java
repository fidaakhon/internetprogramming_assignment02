package AssignmentNo2;

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }

    @Override
    public String toString() {
        return "This is a triangle";
    }
}
