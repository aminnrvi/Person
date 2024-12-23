import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Person person = new Person();

      person.setName("John");
      person.setSurname("Doe");
      person.setAge(22);
      person.setGender(true);

      System.out.println(person.toString());
    }
}