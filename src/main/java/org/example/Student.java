package org.example;

public class Student {
    private String id;
    private String name;
    private String postalCode;
    private int age;

    public Student(String csvLine) {
        try {
            String[] data = csvLine.split(",");
            this.id = data[0].trim();
            this.name = data[1].trim();
            this.postalCode = data[2].trim();
            this.age = Integer.parseInt(data[3].trim());
        } catch (Exception e) {
            System.err.println("Invalid line: " + csvLine);
        }
    }

    // Validate the student object
    public boolean isValid() {
        return name != null && !name.isEmpty() && age > 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", postalCode='" + postalCode + '\'' +
                ", id='" + id + '\'' +
                '}';
    }


    // Implement equals() and hashCode() for proper duplicate detection
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
