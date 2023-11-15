package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);

        // Filter a list of numbers and only output the even numbers.

        List<Integer> filteredList = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        System.out.println(filteredList);

        // Map a list of numbers and multiply each number by 2.

        List<Integer> mappedList = numbers.stream()
                .map(number -> number * 2)
                .toList();

        System.out.println(mappedList);

        // Sort the list in ascending order.
        List<Integer> ascendingList = numbers.stream()
                .sorted()
                .toList();


        System.out.println(ascendingList);

        List<Integer> newList = numbers.stream()
                .filter(number -> number % 2 == 0).map(number -> number * 2).sorted().collect(Collectors.toList());

        System.out.println(newList);

        System.out.println(newList.stream().reduce(0, Integer::sum));
    }
}