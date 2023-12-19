package ru.gb.oseminar.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ru.gb.oseminar.data.Teacher;

public class TeacherService implements UserService<Teacher>{

    private final List<Teacher> teacherList;

    public TeacherService() {
        this.teacherList = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        long maxId = 0L;
        for (Teacher i : teacherList) {
            if (maxId < i.getTeacherId()) {
                maxId = i.getTeacherId();
            }
        }
        teacherList.add(new Teacher(firstName, secondName, patronymic, dateOfBirth, ++maxId));
    }
    
}
