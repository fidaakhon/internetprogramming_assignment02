package AssignmentNo2;

class Node {
    private Shape data;
    private Node next;

    public Node(Shape shape) {
        this.data = shape;
        this.next = null;
    }

    public Shape getData() {
        return data;
    }

    public void setData(Shape data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

