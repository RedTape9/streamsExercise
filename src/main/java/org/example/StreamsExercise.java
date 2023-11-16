package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsExercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);

        // Filter a list of numbers and only output the even numbers.

        List<Integer> evenNumbers = getEvenNumbers(numbers);

        System.out.println(evenNumbers);

        // Map a list of numbers and multiply each number by 2.

        List<Integer> numbersMultiplyBy2 = getNumbersMultiplyBy2(numbers);

        System.out.println(numbersMultiplyBy2);

        // Sort the list in ascending order.
        List<Integer> ascendingList = getNumbersInAscendingOrder(numbers);

        System.out.println(ascendingList);

        // combination of all three tasks
        List<Integer> newList = numbers.stream()
                .filter(number -> number % 2 == 0).map(number -> number * 2).sorted().collect(Collectors.toList());

        System.out.println(newList);

        // sum of all numbers in the list
        System.out.println(newList.stream().reduce(0, Integer::sum));
    }

    private static List<Integer> getNumbersInAscendingOrder(List<Integer> numbers) {
        List<Integer> ascendingList = numbers.stream()
                .sorted()
                .toList();
        return ascendingList;
    }

    private static List<Integer> getNumbersMultiplyBy2(List<Integer> numbers) {
        List<Integer> mappedList = numbers.stream()
                .map(number -> number * 2)
                .toList();
        return mappedList;
    }

    private static List<Integer> getEvenNumbers(List<Integer> numbers) {
        List<Integer> filteredList = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        return filteredList;
    }

}
