public class Student extends School {
    static int numOfStudents = 0;
    String name;
    int age;
    double gpa;
    boolean isStudent;

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isStudent = true;
        numOfStudents++;
    }

    void occupation() {
        System.out.println(this.name + " is a Student.");
    }
}