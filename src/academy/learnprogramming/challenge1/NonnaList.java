package academy.learnprogramming.challenge1;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class NonnaList {
    private static final int INIT_SIZE = 10;
    private int extendedSize;
    private int size;
    private Object[] arr;
    private Object[] tempArr;


    public NonnaList(int initSize) {
        this.arr = new Object[initSize];
        this.extendedSize = initSize;
    }

    public NonnaList() {
        this(INIT_SIZE);
        this.extendedSize = INIT_SIZE;
    }

    public void add(Object elem){
        if(size() > arr.length - 1) {
            extendedSize *= 2;
            tempArr = new Object[arr.length];
            tempArr = Arrays.copyOf(arr, arr.length);
            arr = new Object[extendedSize];
            arr = Arrays.copyOf(tempArr, extendedSize);
        }
        arr[size] = elem;
        size++;
    }

    public Object remove(int index){
        //sift all elements to 1 position left
        Object elem = arr[index];
        for (int k = index; k < arr.length - 1; k++){
            arr[k] = arr[k + 1];
        }
        return elem;
    }

    public Object remove(Object element){
        int index = 0;
        for(int i = 0; i < arr.length-1; i++){
            if (arr[i]!=null && arr[i].equals(element)){
                index = i;
                break;
            }else{
                index = -1;
            }
        }
       if(index == -1) {
           throw new NoSuchElementException("Provided element does not exist in the list " + element);
       }
        this.remove(index);
        return element;
    }

    public int size(){
        return size;
    }

    public void clear(){
        arr = null;
    }

    public Object get(int index){
        if(index > arr.length -1 || index < 0 || arr[index]== null){
            throw new NoSuchElementException("Element with provided index does not exist in the list. Index:" + index);
        }else {
            return arr[index];
        }
    }

    public void removeAll(NonnaList list){
        for (int i = list.size - 1; i >= 0; i--){
            for(int k = this.size; k >=0; k--){
                 if(list.get(i).equals(arr[k])){
                     this.remove(k);
                 }
            }
        }
    }

    @Override
    public String toString() {
        return "NonnaList{" +
                "INIT_SIZE=" + INIT_SIZE +
                "exten" + extendedSize +
                ", size=" + size +
                ", arr=" + Arrays.toString(arr) +
                ", tempArr=" + Arrays.toString(tempArr) +
                "arr.length" + arr.length +
                '}';
    }
}
