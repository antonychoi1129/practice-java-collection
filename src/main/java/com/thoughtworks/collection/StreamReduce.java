package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream()
            .filter(number -> number % 2 == 1)
            .reduce((accumulated, oddNumber) -> oddNumber)
            .get();
    }

    public String getLongest(List<String> words) {
        return words.stream().
            reduce("", (accumulated, current) -> current.length() > accumulated.length()?current:accumulated);
    }

    public int getTotalLength(List<String> words) {
        return words.stream()
            .reduce(0, (accumulated, current) -> accumulated + current.length(), Integer::sum);
    }
}
