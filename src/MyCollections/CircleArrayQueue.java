package MyCollections;

import java.util.*;

public class CircleArrayQueue<E> implements MyQueue<E> {
    private int head;
    private int tail;
    private E[] elements;
    CircleArrayQueue(int capacity) {

    }

    @Override
    public void add(E element) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("111");
        list.add("2222");
        list.add("333333");
        list.add("44444");

        String[] strings = list.toArray(new String[]{});
        HashSet<String> hashSet = new HashSet<>();
        // hashSet.removeAll();

        System.out.println(strings.toString());
    }



}
