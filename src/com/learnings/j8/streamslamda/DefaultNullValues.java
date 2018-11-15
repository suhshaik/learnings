package com.learnings.j8.streamslamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DefaultNullValues {
    public static void main(String[] args) {
        System.out.println("Defaulting the NULL values in collection");

        List<Integer> list = new ArrayList<Integer>();
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        list.add(Integer.valueOf(3));
        list.add(null);
        list.add(Integer.valueOf(4));
        list.add(null);
        System.out.println("Withou Streams and Lambda...");
        list.forEach(i -> System.out.println(i));

        List<Integer> newList = list.stream().filter(i -> i == null).collect(Collectors.toList());
        System.out.println("Using Streams...");
        newList.forEach(i -> System.out.println(i));

        list.replaceAll(i -> i==null ? Integer.valueOf(100):i);
        System.out.println("Using Lambda...");
        list.forEach(i -> System.out.println(i));
    }
}
