package com.my.interview.collections;

public class NonnasLinkedLIst<E> {
    private int size = 0;
    private NonnasNode<E> node;
    private NonnasNode<E> previous;
    private NonnasNode<E> next;
    private NonnasNode<E> head;

    public NonnasLinkedLIst() {
    }


    public void add(E elem){
        if(size == 0){
            this.head = new NonnasNode<>(null, elem, null);
            this.previous = head;
            this.next = null;
        }else{
            this.node = new NonnasNode<>(previous, elem, next);
            this.previous = node;
        }
        size++;
    }

    @Override
    public String toString() {
        return "NonnasLinkedLIst{" +
                "size=" + size +
                ", node=" + node +
                ", previous=" + previous +
                ", next=" + next +
                ", head=" + head +
                '}';
    }
}
