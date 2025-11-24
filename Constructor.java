public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("siddhant", 20);
        Student s2 = new Student("onkar", 22);
        s1.roll = 101;
        s1.password = "siddhant@123";
        System.out.println("Student 1: Name = " + s1.name + ", Age = " + s1.age);
        System.out.println("Student 2: Name = " + s2.name + ", Age = " + s2.age);

        Student s3 = new Student(s1, s2); // Using copy constructor
        s3.password = "newpassword@123";
        System.out.println("Student 3 (copy of Student 1): Name = " + s3.name + ", Age = " + s3.age);
        System.out.println("Student 1 Password: " + s1.password);
        System.out.println("Student 3 Password: " + s3.password);
    }
}

class Student {
    String name;
    int age;
    int roll;
    String password;

    // Copy constructor
    Student(Student s1, Student s2) {
        this.name = s1.name;
        this.age = s2.age;
    }

    // Constructor to initialize the Student object
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(int roll) {
        this.roll = roll;
    }
}
