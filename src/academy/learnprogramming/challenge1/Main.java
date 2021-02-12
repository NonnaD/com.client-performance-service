package academy.learnprogramming.challenge1;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        NonnaList list = new NonnaList(10);
//        list.add("Nonna");
//        list.add("You");
//        list.add("Did");
//        list.add("Hola");
//        list.add("Amigos");
//        list.add("Que");
//        list.add("PAssa");
//
//        System.out.println(list.toString());
//        System.out.println(list.size());
//
////        list.remove(1);
////        System.out.println(list.toString());
//
//
//        NonnaList list2 = new NonnaList(3);
//        list2.add("Nonna");
//        list2.add("You");
//        list2.add("Did");
//        list.removeAll(list2);
//        System.out.println(list.toString());
//
//        NonnasLinkedLIst<String> linked = new NonnasLinkedLIst<>();
//        linked.add("HI");
//        linked.add("Nonna");
//        linked.add("How are you");
//        System.out.println(linked.toString());

//        //is palindrome with deque
//        System.out.println(isPolindrome("NonnoN"));
//        System.out.println(isPolindrome("Nonna"));


//    public static boolean isPolindrome(String phrase){
//        ArrayDeque dequ =  new ArrayDeque();
//        String reversed = "";
//
//        //converte string to char array and one by one add to the deque
//        for(char ch: phrase.toCharArray()){
//            //dequ.addLast(ch);
//            dequ.offerLast(ch);
//        }
//        System.out.println(dequ);
//        while (!dequ.isEmpty()){
//            //reversed = reversed + dequ.removeLast();
//            reversed = reversed + dequ.pollLast();
//        }
//        //dequ.peekFirst(); same as getFirst()
//        //dequ.peekLast(); same as getLast()
//        return phrase.equals(reversed);
//    }


        List<String> list = new ArrayList<>();
        list.add("Nonna");
        list.add("You");
        list.add("Did");
        list.add("Hola");
        list.add("Amigos");
        list.add("Que");
        list.add("PAssa");

        String[] arr = new String[]{"Nonna", "Did", "hdhdhdh", "djdjdj"};

        for (String s:arr) {
            System.out.println(list.contains(s));
        }



    }

}
