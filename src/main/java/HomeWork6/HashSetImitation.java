package HomeWork6;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class HashSetImitation<E> {
    private List<E> elements;

    public HashSetImitation() {
        elements = new ArrayList<>();
    }

    public void add(E element) {
        if (!elements.contains(element)) {
            elements.add(element);
        }
    }

    public E get(int index) {
        if (index < 0 || index >= elements.size()) {
            throw new IndexOutOfBoundsException();
        }
        return elements.get(index);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; elements.size() > i; i++) {
            sb.append(elements.get(i));
            if (i != elements.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        HashSetImitation<Integer> set = new HashSetImitation<>();
        set.add(1);
        set.add(4);
        set.add(8);
        set.add(2);
        set.add(6);
        set.add(9);
        System.out.println(set.toString());
        System.out.println(set.get(2));
    }
}
