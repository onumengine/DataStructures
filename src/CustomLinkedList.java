import java.util.ArrayList;
import java.util.Arrays;

public class CustomLinkedList {

    /**
     * This class assumes that the nodes are indexed like arrays
     * the first node has an index of 0
     * the last node has an index of [numberOfNodes - 1]
     *
     * The getNode method takes in a zero-based index:
     * [getNode(0)] will return the first node,
     * [getNode(1)] will return the second node,
     * [getNode(2)] will return the third node.. and so on.
     */

    private Node firstNode, lastNode;
    private int numberOfNodes;

    public CustomLinkedList() {
        this.numberOfNodes = 0;
    }

    @Override
    public String toString() {
        if (this.numberOfNodes == 0) {
            return "This LinkedList is empty";
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            Node currentNode = firstNode;
            int i = 1;
            do {
                list.add(currentNode.value);
                currentNode = currentNode.getNext();
            } while (i <= numberOfNodes);
            return list.toString();
        }
    }

    public void addFirst(int value) {
        if (firstNode != null) {
            Node newNode = new Node(value);
            newNode.setNext(firstNode);
            firstNode = newNode;
            numberOfNodes++;
        } else {
            firstNode = new Node(value);
            numberOfNodes++;
        }
    }

    public void addLast(int value) {
        if (lastNode != null) {
            Node newNode = new Node(value);
            lastNode.setNext(newNode);
            lastNode = newNode;
            numberOfNodes++;
        } else {
            lastNode = new Node(value);
            numberOfNodes++;
        }
    }

    public int deleteFirst() {
        if (firstNode != null) {
            firstNode = firstNode.getNext();
            numberOfNodes--;
            return 1;
        } else {
            return -1;
        }
    }

    public void deleteLast() {
        Node finalNode = getNode(numberOfNodes - 2);
        lastNode = finalNode;
    }

    private Node getNode(int index) {
        Node currentNode = firstNode;
        if (index == 0) {
            return firstNode;
        } else {
            for (int i = 0 ; i < index ; i++) {
                currentNode = currentNode.getNext();
            }
        }
        return currentNode;
    }

    public boolean contains(int number) {
        Node currentNode = firstNode;
        int i = 0;
        do {
            if (currentNode.value == number) {
                return true;
            } else {
                currentNode = currentNode.getNext();
                i++;
            }
        } while (i < numberOfNodes);
        return false;
    }

    public int indexOf(int number) {
        Node currentNode = firstNode;
        int i = 0;
        do {
            if (currentNode.value == number) {
                return i;
            } else {
                currentNode = currentNode.getNext();
                i++;
            }
        } while (i < numberOfNodes);
        return -1;
    }
}
