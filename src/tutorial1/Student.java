package tutorial1;

public class Student implements Comparable<Student>{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public boolean equals(Student other) {
        if (this.name == other.name) {
            return true;
        }
        else {
            return false;
        }
    }

    public int compareTo(Student other) {
        return this.name.compareTo(other.name); // Return how far away the first letter of this name is from the first letter of the other name
    }

    public String toString() { // Java will automatically call this method when you print a Student object
        return this.name;
    }
}
