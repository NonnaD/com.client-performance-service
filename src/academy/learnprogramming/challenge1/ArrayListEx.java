package academy.learnprogramming.challenge1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

    public static void main(String[] args) {
        final List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Wte");
        //replace "Wte" without index
        colors.set(colors.indexOf("Wte"), "White");
        //add orange between blue and green
        colors.add(colors.indexOf("Blue")+1, "Orange");


        //print old fasion
        for(String color : colors){
           // System.out.println(color);
        }

        //if any of the element equals Green remove it from the list
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()){
            String color = iterator.next();
            if (color.equals("Green")){
                colors.remove(colors.lastIndexOf("Green"));
            }
        }


        //add collection of duplicate elements for the next assignment
        List<String> colors2 = new ArrayList<>(colors);

        //copy over all elements from colors2 to colors to add some duplications
        colors.addAll(colors2);

        //add few more diplications
        colors.add("White");
        colors.add("Red");
        colors.addAll(new ArrayList<>(Arrays.asList("Green","Pink","Pink", "Red", "White", "Blue","Pink", "Gold")));

        //Assignment: If some element present in Array 3 or more time remove it and add them to new ArrayList triplicated
        List<String> triplicates= new ArrayList<>();
        colors.forEach(color -> {
            int count = 0;
            int index = 0;
            for (int i = 0; i < colors.size() - 1; i++) {
                if(color.equals(colors.get(i))){
                    count++;
                    if(count>=3){
                        index = i;
                    }
                }
            }
            if(count >= 3 && !triplicates.contains(colors.get(index))) {
                triplicates.add(colors.get(index));
            }
        });

        //make sublist of colors
        List<String> subColors = colors.subList(0,7);

        //reverse elements in place
        colors.forEach(System.out::print);
        System.out.println();

        String temp;
        for(int i = 0; i < colors.size()/2; i++){
            temp = colors.get(i);
            colors.set(i, colors.get(colors.size() - i - 1));
            colors.set(colors.size() - i - 1, temp);
        }


        colors.forEach(System.out::print);

        System.out.println(isEqual(colors, colors2));
        System.out.println(isEqual(new ArrayList<>(colors2), colors2));
        List<String> list2 = new ArrayList<>(colors2);
        colors2.forEach(System.out::print);
        System.out.println();
        list2.forEach(System.out::print);

        //print the array
        //colors.forEach(System.out::println);


    }

    static boolean isEqual(List<String> list1, List<String> list2){
        if(list1.size() != list2.size() ) return false;
        for (int index = 0; index < list1.size() -1; index++){
            if(!list1.get(index).equals(list2.get(index))){
                return false;
            }
        }
        return true;
    }
}
