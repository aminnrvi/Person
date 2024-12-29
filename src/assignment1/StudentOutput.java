package assignment1;

public class StudentOutput {
    public static void main(String[] args) {
        Student student1 = new Student("Harry", "Potter", 24, true);
        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(95);
        System.out.println(student1.toString());
        System.out.println("GPA: " + student1.calculateGPA());

    }
}
