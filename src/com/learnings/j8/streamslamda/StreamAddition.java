package com.learnings.j8.streamslamda;

import java.util.stream.Stream;

public class StreamAddition {

    public static void main(String[] args) {
        System.out.println("Welcome to streams");

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        int sum = integerStream.filter(i -> i > 2).mapToInt(i -> i).sum();
        System.out.println("Sum is : " + sum);
        
        System.out.println("New changes added on GIT directly");
    }
}
