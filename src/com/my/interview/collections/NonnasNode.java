package com.my.interview.collections;

public class NonnasNode<E> {
    private E element;
    private NonnasNode<E> next;
    private NonnasNode<E> prev;

    public NonnasNode(NonnasNode<E> prev, E element, NonnasNode<E> next) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public E getElement() {
        return element;
    }


    @Override
    public String toString() {
        return "NonnasNode{" +
                "element=" + element + '}';
    }
}
