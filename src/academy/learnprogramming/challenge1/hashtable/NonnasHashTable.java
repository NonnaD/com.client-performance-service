package academy.learnprogramming.challenge1.hashtable;

import java.util.Hashtable;

public class NonnasHashTable<K, V> {
    Object[] table;
    private static final int DEFAULT_SIZE = 10;

    public NonnasHashTable(int size) {
        this.table = new Object[size];
    }

    public NonnasHashTable() {
        //to provide value from existing class into constructor it should be static
        //instance variables are not allowed
        this(DEFAULT_SIZE);
    }

    public void put(K key, V value){
        int hashedKey = hashKey(key);
        //im checking if the index of array already occupied
        //if not put element otherwise throw error (or just print index occupied)
        if(table[hashedKey]!=null){
            System.out.println("You see this - Looks like your hashKey() method is not so efficient!" +
                    "Come up with better solution!"
                    + "and Yes this index already occupied");
        }else {
            table[hashedKey] = value;
        }

    }

    public Object get(K key){
        int hashedKey = hashKey(key);
        return table[hashedKey];
    }

    private int hashKey(K key){
        //i used object key toString() function to get sting representation io the object
        //converted it to char array and get the length
        //then i used modular to divide it on table length
        return key.toString().toCharArray().length % table.length;
    }

    public void printTable(){
        for(int i = 0; i < table.length -1; i++){
            System.out.println(table[i]);
        }
    }


}
