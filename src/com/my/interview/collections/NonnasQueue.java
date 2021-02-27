package com.my.interview.collections;

public class NonnasQueue<E> {
    private Object[] elements;
    private int front;
    private int back;
   // private int size;

    public NonnasQueue(int size) {
       // this.size = size;
        elements = new Object[size];
    }

    public void add(E element){
        if(back >= elements.length){
            Object[] resizedElements  = new Object[elements.length*2];
            System.arraycopy(elements, 0, resizedElements, 0, elements.length);

        }
    }
}
