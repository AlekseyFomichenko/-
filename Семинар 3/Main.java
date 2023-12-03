import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "aaa", "aaa", "aaa");
        Student student2 = new Student(5, "asd", "dsa", "rty");
        Student student3 = new Student(2, "axc", "ewq", "fgh");
        Student student4 = new Student(3, "aqw", "weq", "vbn");

        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);

        StudentGroup studentGroup2 = new StudentGroup(studentList);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);
        studentGroup.addStudent(student4);

        List<StudentGroup> studentGroupList = new ArrayList<>();
        studentGroupList.add(studentGroup);
        studentGroupList.add(studentGroup2);

        Stream stream1 = new Stream(1, studentGroupList);

        StreamService service = new StreamService(stream1);
        for (StudentGroup Group : service.getSortedStream()) {
            for (Student student : Group)
                System.out.println(student);
            System.out.println();
        }

        // StudentGroupService service = new StudentGroupService(studentGroup);
        // for (Student student : service.getSortedStudentGroup()) {
        // System.out.println(student);

    }

    // StudentGpoupIterator iterator = new StudentGpoupIterator(studentGroup);
    // while (iterator.hasNext()) {
    // System.out.println(iterator.next());
    // }
    // for (Student student : studentGroup) {
    // System.out.println(student);
    // }

}
