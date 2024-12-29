package assignment1;

import assignment1.Person;

public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            salary += salary * amount / 100;
            System.out.println("New salary after a " + amount + "% raise " + salary);
        } else {
            System.out.println("Amount must be positive");
        }
    }
    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + " and have " + yearsOfExperience + " years of experience.";
    }

    public int GetyearsOfExperience() {
        return yearsOfExperience;
    }


}



