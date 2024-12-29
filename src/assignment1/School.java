package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class School {
    private ArrayList<Person> members = new ArrayList<>();

    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person member) {
        this.members.add(member);
    }
    @Override
    public String toString() {
        Collections.sort(members, Comparator.comparing(Person::getSurname));

        StringBuilder sb = new StringBuilder("School members:\n");
        for (Person member : members) {
            sb.append(member.toString()).append("\n");
        }
        return sb.toString();
    }
}
