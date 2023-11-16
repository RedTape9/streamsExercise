package org.example;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // StreamsExercise.main(args);


        Set<Student> students = new HashSet<>(); // Using a Set to remove duplicates

        try (Stream<String> stream = Files.lines(Paths.get(ClassLoader.getSystemResource("students.csv").toURI()))) {
            stream
                    .skip(1) // Skipping the header
                    .filter(line -> !line.trim().isEmpty()) // Skipping empty lines
                    .map(Student::new) // Converting each line to a Student object
                    .filter(Student::isValid) // Filtering out invalid lines
                    .forEach(students::add); // Adding to the set to remove duplicates
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Printing the students
        System.out.println("Students:");
        students.forEach(System.out::println);
    }
}