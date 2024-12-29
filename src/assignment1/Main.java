package assignment1;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        Student student1 = new Student("Harry", "Potter", 21, true);
        Student student2 = new Student("Ron", "Weasley", 20, true);
        Student student3 = new Student("Hermione", "Granger", 19, false);
        Student student4 = new Student("Luna", "Lovegood", 20, false);
        Student student5 = new Student("Draco", "Malfoy", 21, true);
        student1.addGrade(78);student1.addGrade(89);student1.addGrade(99);student1.addGrade(51);
        student2.addGrade(78);student2.addGrade(89);student2.addGrade(75);student2.addGrade(63);student2.addGrade(82);
        student3.addGrade(100);student3.addGrade(99);student3.addGrade(95);student3.addGrade(98);student3.addGrade(100);student3.addGrade(96);student1.addGrade(97);
        student4.addGrade(46);student4.addGrade(87);student1.addGrade(67);student1.addGrade(79);student1.addGrade(96);student1.addGrade(58);student1.addGrade(83);
        student5.addGrade(21);student5.addGrade(45);student1.addGrade(0);student1.addGrade(9);student1.addGrade(51);student1.addGrade(43);

        Teacher teacher1 = new Teacher("Severus", "Snape", 51, true, "Math", 7, 800000);
        Teacher teacher2 = new Teacher("Albus", "Dumbledore" ,71, true, "Philosophy", 25, 1500000);
        Teacher teacher3 = new Teacher("Minerva", "McGonagall" ,62, false, "Sociology", 17, 1100000);
        Teacher teacher4 = new Teacher("Bellatrix", "Lestrange",35, false, "Programming", 3, 570000);
        Teacher teacher5 = new Teacher("Sirius", "Black", 49, true, "Physics", 9, 750000);

        Teacher[] teachers = {teacher1, teacher2, teacher3, teacher4, teacher5};
        for (Teacher teacher : teachers) {
            if (teacher.GetyearsOfExperience() > 10) {
                teacher.giveRaise(10); // Give a 10% raise
            }
        }

        school.addMember(student1);
        school.addMember(student2);
        school.addMember(student3);
        school.addMember(student4);
        school.addMember(student5);
        school.addMember(teacher1);
        school.addMember(teacher2);
        school.addMember(teacher3);
        school.addMember(teacher4);
        school.addMember(teacher5);

        System.out.println(school);

        System.out.println("Testing GPA for students:");
        System.out.println(student1.getName() + "'s GPA: " + student1.calculateGPA());
        System.out.println(student2.getName() + "'s GPA: " + student2.calculateGPA());
        System.out.println(student3.getName() + "'s GPA: " + student3.calculateGPA());
        System.out.println(student4.getName() + "'s GPA: " + student4.calculateGPA());
        System.out.println(student5.getName() + "'s GPA: " + student5.calculateGPA());



    }
}
