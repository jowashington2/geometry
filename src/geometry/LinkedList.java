package geometry;

import java.util.ArrayList;

/**
 * A generic linked list class to store geometries.
 */
public class LinkedList<T> {
    private ArrayList<T> list;

    /**
     * Constructor for LinkedList.
     */
    public LinkedList() {
        list = new ArrayList<>();
    }

    /**
     * Adds an item to the list.
     * @param item Item to add.
     */
    public void add(T item) {
        list.add(item);
    }

    /**
     * Removes an item from the list.
     * @param item Item to remove.
     */
    public void remove(T item) {
        list.remove(item);
    }

    /**
     * Finds an item by index.
     * @param index Index of the item.
     * @return The item at the specified index.
     */
    public T find(int index) {
        return list.get(index);
    }

    /**
     * Prints all items in the list.
     */
    public void printAll() {
        for (T item : list) {
            System.out.println(item);
        }
    }
}
