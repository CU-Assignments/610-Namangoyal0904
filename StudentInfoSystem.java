import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
abstract class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void displayDetails();
}
class Student extends Person {
    int rollNumber;
    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}
class Teacher extends Person {
    String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}
public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        while (true) {
            System.out.println("\nStudent Information System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Display All");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    addStudent(scanner, people);
                    break;
                case 2:
                    addTeacher(scanner, people);
                    break;
                case 3:
                    displayAll(people);
                    break;
                case 4:
                    System.out.println("Exiting Student Information System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void addStudent(Scanner scanner, List<Person> people) {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); 
        Student student = new Student(name, age, rollNumber);
        people.add(student);
        System.out.println("Student added successfully!");
    }
    private static void addTeacher(Scanner scanner, List<Person> people) {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();
        Teacher teacher = new Teacher(name, age, subject);
        people.add(teacher);
        System.out.println("Teacher added successfully!");
    }
    private static void displayAll(List<Person> people) {
        if (people.isEmpty()) {
            System.out.println("No records to display.");
            return;
        }
        for (Person person : people) {
            person.displayDetails();
            System.out.println(); 
        }
    }
}
