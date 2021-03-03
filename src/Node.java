public class Node {

    public int value;

    private Node next;

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node() {}

    public Node(int value) {
        this.value = value;
    }
}
