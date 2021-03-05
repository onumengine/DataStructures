import java.util.ArrayList;

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

    public void addFirst(int value) {
        if (firstNode != null) {
            Node newNode = new Node(value);
            newNode.setNext(firstNode);
            firstNode = newNode;
            numberOfNodes++;
        } else {
            firstNode = new Node(value);
            lastNode = firstNode;
            numberOfNodes++;
        }
    }

    public void addLast(int value) {
        if (lastNode != null) {
            Node newNode = new Node(value);
            lastNode.setNext(newNode);
            lastNode = newNode;
            numberOfNodes++;
            if (numberOfNodes == 2) {
                firstNode.setNext(lastNode);
            }
        } else {
            lastNode = new Node(value);
            numberOfNodes++;
        }
    }

    public boolean contains(int number) {
        Node currentNode = this.firstNode;
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

    public int deleteFirst() {
        if (firstNode != null) {
            Node nodeToBeDeleted = firstNode;
            firstNode = firstNode.getNext();
            nodeToBeDeleted.setNext(null);
            numberOfNodes--;
            return 1;
        } else {
            return -1;
        }
    }

    public void deleteLast() {
        Node secondToLastNode = getNodeByIndex(numberOfNodes - 2);
        secondToLastNode.setNext(null);
        lastNode = secondToLastNode;
        numberOfNodes--;
    }

    private Node getNodeByIndex(int index) {
        Node currentNode = firstNode;
        if (index == 0) {
            return currentNode;
        } else {
            for (int i = 1 ; i < index ; i++) {
                currentNode = currentNode.getNext();
            }
        }
        return currentNode;
    }

    public int indexOf(int number) {
        Node currentNode = this.firstNode;
        int i = 0;
        do {
            if (currentNode.value == number) {
                return i;
            } else {
                currentNode = currentNode.getNext();
                i++;
            }
        } while (i < this.numberOfNodes);
        return -1;
    }

    @Override
    public String toString() {
        if (numberOfNodes == 0) {
            return "This LinkedList is empty";
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            Node currentNode = firstNode;
            int i = 1;
            do {
                list.add(currentNode.value);
                if (currentNode.hasNext()) {
                    currentNode = currentNode.getNext();
                    i++;
                } else {
                    break;
                }
            } while (i <= numberOfNodes);
            return list.toString();
        }
    }
}
