package service;

import java.util.List;

import model.*;

public class StudyGropService extends DataService {

    private List<StudyGroup> studyGroupList;

    public void create(StudyGroup studentGroup, Teacher teacher) {
        for (User user : super.getAllConcUser(Type.STUDENT)) {
            if (!studentGroup.getStudentList().contains(user)) {
                ((StudyGroup) studyGroupList).getStudentList().add(user);
            }
        }
        if (studentGroup.getTeacher() == null) {
            ((StudyGroup) studyGroupList).setTeacher(teacher);
        }
    }

    public List<User> getStudentList(List<User> studentGroup) {
        return ((StudyGroup) studentGroup).getStudentList();
    }

    public List<StudyGroup> getStudyGroupList() {
        return studyGroupList;
    }

    public void setStudyGroupList(List<StudyGroup> studyGroupList) {
        this.studyGroupList = studyGroupList;
    }
    
}
