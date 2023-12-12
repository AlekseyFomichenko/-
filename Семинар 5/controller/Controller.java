import model.*;
import service.*;
import view.StudentView;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyGropService studyGropService = new StudyGropService();

    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void createStudyGroup(StudyGroup studyGroup, Teacher teacher){
        studyGropService.create(studyGroup, teacher);
    }

    public void getAllStudent(){
        for (User user : dataService.getAllConcUser(Type.STUDENT)) {
            studentView.printOnConsole((Student)user);
        }
    }
}

