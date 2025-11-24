public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("siddhant", 20);
        Student s2 = new Student("onkar", 22);

        System.out.println("Student 1: Name = " + s1.name + ", Age = " + s1.age);
        System.out.println("Student 2: Name = " + s2.name + ", Age = " + s2.age);
    }
}

class Student {
    String name;
    int age;

    // Constructor to initialize the Student object
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
