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
        //check if array length is not OutOfBound
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
