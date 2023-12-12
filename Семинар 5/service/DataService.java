package service;

import java.util.ArrayList;
import java.util.List;

import model.*;

public class DataService {
    
    private List<User> userList;

    public void create(String firstName, String secondName, String lastName, Type type){

        int id = getMaxID(type);
        if (type == Type.STUDENT) {
            userList.add(new Student(firstName, secondName, lastName, id));        
        }
        if (type == Type.TEACHER) {
            userList.add(new Teacher(firstName, secondName, lastName, id));
        }
    }

    private int getMaxID(Type type){

        boolean isStudent = type == Type.STUDENT;
        int maxID = 0;
        for (User user : userList) {
            if (user instanceof Student && isStudent) {
                maxID = ((Student)user).getStudentID() + 1;
            }
            if (user instanceof Teacher && !isStudent) {
                maxID = ((Teacher)user).getTeacherID() + 1;
            }
        }
        return maxID;
    }

    public List<User> getAllConcUser(Type type){

        List<User> result = new ArrayList<>();
        boolean isStudent = type == Type.STUDENT;
        for (User user : userList) {
            if (user instanceof Student && isStudent) {
                result.add(user);
            }
            if (user instanceof Teacher && !isStudent) {
                result.add(user);
            }
        }
        return result;
    }

    public List<User> getUserList() {
        return userList;
    }
    
}
