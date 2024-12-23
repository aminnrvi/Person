public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Hi, I am " + name + " " + surname + " a " + age + " years old " + (gender ? "male" : "female");
    }
}
