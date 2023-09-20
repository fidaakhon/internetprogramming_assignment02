package AssignmentNo2;

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(Shape shape) {
        Node newNode = new Node(shape);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void displayShapes() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getData().toString());
            current = current.getNext();
        }
    }
}

