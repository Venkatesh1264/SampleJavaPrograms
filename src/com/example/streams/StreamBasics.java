package com.example.streams;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
  What is stream?
  limit operator
  filter and map opertor
  reducer operator
  sorting and reverse sorting
 */
public class StreamBasics {
    public static void main(String[] args) {
        StreamBasics streamBasics = new StreamBasics();
        List<Integer> integerList = streamBasics.getIntegerList();
        System.out.println("limit operator for showing specific limit of items from the list");
        integerList.stream().limit(4).forEach(System.out::println);

        System.out.println("\nExtracting even numbers from the list");
        integerList.stream().filter((value) -> value % 2 ==0).forEach(System.out::println);

        System.out.println("\nUsing map operator multiplying even numbers with 2");
        integerList.stream().filter((value) -> value % 2 ==0).map(value -> value*2).forEach(System.out::println);

        Optional<Integer> optionalSum = integerList.stream().reduce((val1, val2) -> val1+val2);
        if(optionalSum.isPresent()){
            System.out.println("\nSum of all elements from the list: "+optionalSum.get());
        }

        Integer minValue = integerList.stream().reduce((val1, val2)-> val1<val2 ? val1 : val2).get();
        System.out.println("\nMin value from the list: "+ minValue);

        Integer maxValue = integerList.stream().reduce((val1, val2)-> val1>val2 ? val1 : val2).get();
        System.out.println("\nMax value from the list: "+ maxValue);

        System.out.println("\nPrinting values from list in ascending order");
        integerList.stream().sorted().forEach(System.out::println);

        System.out.println("\nPrinting values from list in descending order");
        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public List<Integer> getIntegerList() {
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(91);
        numbersList.add(80);
        numbersList.add(33);
        numbersList.add(20);
        numbersList.add(44);
        numbersList.add(72);
        numbersList.add(11);
        numbersList.add(5);
        numbersList.add(84);
        return numbersList;
    }
}
