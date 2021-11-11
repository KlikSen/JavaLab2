package Task4;

import Task3.Mark;
import Task3.Student;
import Task3.Subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group {
    public String nameOfGroup;
    public List<Student> students;
    public List<Map<Integer, Mark>> mapsOfMarksInList;

    public Group(final String nameOfGroup, final List<Student> students) {
        this.nameOfGroup = nameOfGroup;
        this.students = students;
    }

    public void addNewSubjectForStudents(final Subject subject){
        for (final Student student : students){
            student.addSubject(subject);
        }
    }
    public void showGroup(){
        System.out.println(this.toString());
    }

    public Student showTheBestStudent(){
        Student bestStudent = students.get(0);
        for (int i = 1; i < students.size(); i++){

            double averageScore1 = 0, averageScore2 = 0;

            for (int j = 1; j < bestStudent.getMarks().size(); j++) {
                averageScore1 += bestStudent.getMarks().get(j).getMark();
            }
            for (int j = 1; j < bestStudent.getMarks().size(); j++) {
                averageScore2 += students.get(i).getMarks().get(j).getMark();
            }
            averageScore1 /= students.get(i).getMarks().size();
            averageScore2 /= students.get(i).getMarks().size();

            if (averageScore2 > averageScore1){
                bestStudent = students.get(i);
            }
        }
        return bestStudent;
    }

    public void buildMapsOfMarksInList (){
        final List<Map<Integer, Mark>> newMapsOfMarksInList = new ArrayList<>();

        for (int i = 0; i < students.get(0).subjects.size(); i++){

            final Map<Integer, Mark> newSubjectMap = new HashMap<>();

            for (int j = 0; j < students.size(); j++){
                newSubjectMap.put(students.get(j).getId(), students.get(j).getMarks().get(i));
            }
            newMapsOfMarksInList.add(newSubjectMap);
        }
        this.mapsOfMarksInList = newMapsOfMarksInList;
    }

    public Map<Integer, Mark>  showAllMarksBySubject (final String sub){
        buildMapsOfMarksInList();

        final List<Subject> findSameSubject = students.get(0).subjects.stream()
                .filter(a -> a.getSubjectName().equals(sub))
                .collect(Collectors.toList());
        final int idOfSaneSubject = findSameSubject.get(0).getId();

        return mapsOfMarksInList.get(idOfSaneSubject);
    }

    @Override
    public String toString() {
        return "Group{" +
                "nameOfGroup='" + nameOfGroup + '\'' +
                ", students=" + students +
                '}';
    }
}
