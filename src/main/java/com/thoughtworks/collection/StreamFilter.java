package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public List<Integer> filterEven(List<Integer> numbers) {
        return numbers.stream()
            .filter( number -> number % 2 == 0)
            .collect(Collectors.toList());
    }

    public List<String> filterEndWithS(List<String> words) {
        return words.stream()
            .filter(word -> word.endsWith("s"))
            .collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> numbers, List<Integer> anotherNumbers) {
        return numbers.stream()
            .filter(number -> anotherNumbers.contains(number))
            .collect(Collectors.toList());
    }
}
