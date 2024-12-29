package assignment1;

public class TeacherOutput {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("John", "Doe", 22, true, "Math", 5, 10000);
        System.out.println(teacher1.toString());
        teacher1.giveRaise(10);
    }
}