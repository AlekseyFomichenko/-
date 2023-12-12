package model;


import java.util.List;

public class StudyGroup {

    private List<User> studentList;
    private Teacher teacher;
    
    public StudyGroup(List<User> studentList, Teacher teacher) {
        this.studentList = studentList;
        this.teacher = teacher;
    }

    public List<User> getStudentList() {
        return studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setStudentList(List<User> studentList) {
        this.studentList = studentList;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudyGroup [studentList=" + studentList + ", teacher=" + teacher + "]";
    }
}

