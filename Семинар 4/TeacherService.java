import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{

    private final List<Teacher> teacherList = new ArrayList<>();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        for (Teacher i : teacherList) {
            if (maxId < i.getTeacherID()) {
                maxId = i.getTeacherID();
            }
        }
        teacherList.add(new Student(++maxId, firstName, secondName, lastName));
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }
    
}
