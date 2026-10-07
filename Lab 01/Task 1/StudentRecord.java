class Student {
    String name;;
    int id;
    double marks;

    void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    void checkResult() {
        if (marks >= 40) {
            System.out.println(name + " has PASSED.");
        } else {
            System.out.println(name + " has FAILED.");
        }
    }
}

public class StudentRecord {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id = 101;
        student1.name = "Rafi";
        student1.marks = 78.5;

        Student student2 = new Student();
        student2.id = 102;
        student2.name = "Mim";
        student2.marks = 32.0;

        student1.displayInfo();
        student1.checkResult();

        System.out.println();

        student2.displayInfo();
        student2.checkResult();
    }
}