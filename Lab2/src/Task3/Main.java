package Task3;

import java.util.List;

public class Main {
    public static void main(final String[] args) {

        final Mark mark1 = new Mark(10);
        final Mark mark2 = new Mark(4);
        final Subject subject1 = new Subject("physics");
        final Subject subject2 = new Subject("mathematics");

        final List<Mark> listOfMarks = List.of(mark1, mark2);
        final List<Subject> listOfSubjects = List.of(subject1, subject2);

        final Student student1 = new Student("Ihor", "Kubryk", listOfMarks, listOfSubjects);

        System.out.println(student1);
    }
}
