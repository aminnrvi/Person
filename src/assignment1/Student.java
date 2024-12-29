package assignment1;

import java.util.List;

public class Student extends Person {
    private int studentID;
    private static int id_gen = 1;
    private List<Integer> grades;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = id_gen++;
        this.grades = new java.util.ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Added grade " + grade);
        } else {
            System.out.println("Grade must be between 0 and 100");
        }
    }
    public double calculateGPA() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    @Override
    public String toString() {
        return super.toString() + " I am a student with ID  " + studentID + ".";
    }
}