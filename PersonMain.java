import java.util.Scanner;
class Person {
    String name;
    int age;
    long phoneNumber;
    String address;
    Person(String name, int age, long phoneNumber, String address) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone no.: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}
class Teacher extends Person {
    String subject;
    Teacher(String name, int age, long phoneNumber, String address, String subject) {
        super(name, age, phoneNumber, address);
        this.subject = subject;
    }
    void printSubject() {
        System.out.println("Subject: " + subject);
    }
}
class Student extends Person {
    String course;

    Student(String name, int age, long phoneNumber, String address, String course) {
        super(name, age, phoneNumber, address);
        this.course = course;
    }

    void printCourse() {
        System.out.println("Course: " + course);
    }
}
public class PersonMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String teacherName = s.nextLine();
        int teacherAge = s.nextInt();
        long teacherPhone = s.nextLong();
        s.nextLine();
        String teacherAddress = s.nextLine();
        String teacherSubject = s.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherAge, teacherPhone, teacherAddress, teacherSubject);
        teacher.printDetails();
        teacher.printSubject();
        System.out.println()
        String studentName = s.nextLine();
        int studentAge = s.nextInt();
        long studentPhone = s.nextLong();
        s.nextLine();
        String studentAddress = s.nextLine();
        String studentCourse = s.nextLine();
        Student student = new Student(studentName, studentAge, studentPhone, studentAddress, studentCourse);
        student.printDetails();
        student.printCourse();
        s.close();
    }
}
