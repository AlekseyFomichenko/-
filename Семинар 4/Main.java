import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        StudentController controller = new StudentController();
        controller.create("aaa", "aaa", "aaa");
        controller.create("asd", "dsa", "rty");
        controller.create("axc", "ewq", "fgh");
        controller.create("aqw", "weq", "vbn");

        controller.sendOnConsole();
        
        // Student student1 = new Student(1, "aaa", "aaa", "aaa");
        // Student student2 = new Student(5, "asd", "dsa", "rty");
        // Student student3 = new Student(2, "axc", "ewq", "fgh");
        // Student student4 = new Student(3, "aqw", "weq", "vbn");

        // List<Student> studentList = new ArrayList<>();
        // StudentGroup studentGroup = new StudentGroup(studentList);
        // studentGroup.addStudent(student1);
        // studentGroup.addStudent(student2);
        // studentGroup.addStudent(student3);
        // studentGroup.addStudent(student4);
        // StudentGroupService service = new StudentGroupService(studentGroup);
        // for (Student student : service.getSortedStudentGroup()) {
        //     System.out.println(student);
        // }
        // StudentGpoupIterator iterator = new StudentGpoupIterator(studentGroup);
        // while (iterator.hasNext()) {
        // System.out.println(iterator.next());
        // }
        // for (Student student : studentGroup) {
        // System.out.println(student);
        // }

    }
}
