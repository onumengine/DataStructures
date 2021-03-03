import java.util.Arrays;

public class DynamicArray {

    int[] items;
    int size;

    public DynamicArray(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0 ; i < size ; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int number) {
        if (size < items.length) {
            items[size] = number;
            size++;
        } else {
            int[] newArray = new int[size * 2];
            for (int i = 0; i < size ; i++) {
                newArray[i] = items[i];
            }
            newArray[size] = number;
            items = newArray;
        }
    }

    public void remove(int number) {
        // Remove number from the array
        // Move all the elements in the array forward
        // Reduce the size of the array
    }

    public void removeAt(int index) {
        if (index < size) {
            items[index] = 0;
            for (int i = index ; i < size ; i++) {
                items[index] = items[index + 1];
            }
            size --;
        }
    }

    public int indexOf(int number) {
        for (int i = 0 ; i < size ; i++) {
            if (items[i]  == number) {
                return i;
            }
        }
        return -1;
    }
}
