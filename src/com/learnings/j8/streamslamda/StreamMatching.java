package com.learnings.j8.streamslamda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMatching {
    public static void main(String[] args) {
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> nameStream = builder.add("Mike").add("John").add("Dan").build();

        //nameStream.forEach(System.out::println);
        //List<String> list = nameStream.map(String::toLowerCase).collect(Collectors.toList());
        List<String> list = nameStream.map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list);
    }
}
