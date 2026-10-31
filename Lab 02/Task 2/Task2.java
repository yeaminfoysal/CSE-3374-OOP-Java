import java.util.Scanner;

class Student {

    static String schoolName = "Northern University";
    static int studentCount = 0;

    String name;
    int roll;
    double cgpa;

    Student(String name, int roll, double cgpa) {
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
        studentCount++;
    }

    void displayInfo() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
    }

    static void displayTotalStudents() {
        System.out.println("School: " + schoolName);
        System.out.println("Total Students Registered: " + studentCount);
    }
}

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll: ");
            int roll = sc.nextInt();

            System.out.print("Enter CGPA: ");
            double cgpa = sc.nextDouble();
            sc.nextLine();

            Student s = new Student(name, roll, cgpa);
            s.displayInfo();
        }

        Student.displayTotalStudents();

        sc.close();
    }
}