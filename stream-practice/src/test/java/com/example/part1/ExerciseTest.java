package com.example.part1;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExerciseTest {

    Exercise exercise = new Exercise();

    @Test
    public void test_count() {
        IntStream intStream = IntStream.of(1, 2, 3, 50, 20, 10);
        assertEquals(6, exercise.count(intStream));
    }

    @Test
    public void test_increment() {
        IntStream intStream = IntStream.of(1, 2, 3, 50, 20, 10);
        assertTrue(intStreamContainsAnother(IntStream.of(2, 3, 4, 51, 21, 11), exercise.increment(intStream)));
    }

    private boolean intStreamContainsAnother(IntStream streamOfX, IntStream streamOfY) {
        Set<Integer> setOfX = streamOfX.boxed().collect(Collectors.toSet());
        return streamOfY.allMatch(setOfX::contains);
    }

    @Test
    public void test_sum() {
        IntStream intStream = IntStream.of(1, 2, 3, 4);
        assertEquals(10, exercise.sum(intStream));
    }

    @Test
    public void test_sum_with_negatives() {
        IntStream intStream = IntStream.of(-1, 2, 3, -4);
        assertEquals(5, exercise.sum(intStream));
    }

    @Test
    public void test_filter() {
        IntStream intStream = IntStream.of(1, -2, 3, -50, 20, -10);
        assertTrue(intStreamContainsAnother(IntStream.of(1, 3, 20), exercise.filter(intStream)));
    }

    @Test
    public void test_concatenate() {
        Stream<String> stream = Stream.of("hello", " ", "world", "!!");
        assertEquals("hello world!!", exercise.concatenate(stream));
    }
}
