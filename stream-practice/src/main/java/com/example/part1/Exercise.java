package com.example.part1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise {

    public int count(IntStream intStream) {
        return intStream.map(e -> 1).sum();
    }

    public IntStream increment(IntStream intStream) {
        return intStream.map(e -> e + 1);
    }

    public int sum(IntStream intStream) {
        return intStream.filter(e -> e > 0).sum();
    }

    public IntStream filter(IntStream intStream) {
        return intStream.flatMap(e -> e > 0 ? IntStream.of(e) : null);
    }

    public String concatenate(Stream<String> stream) {
        return stream.collect( Collectors.joining( "" ) );
    }
}
