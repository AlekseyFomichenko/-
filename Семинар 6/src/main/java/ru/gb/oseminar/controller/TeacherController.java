package ru.gb.oseminar.controller;

import java.time.LocalDate;

import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.service.TeacherService;
import ru.gb.oseminar.view.TeacherView;

public class TeacherController implements UserController<Teacher>{

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    public void sendOnConsoleAll() {
        teacherView.sendOnConsole(teacherService.getAll());
    }

    public void printTeacher(Teacher teacher){
        teacherView.sendOnConsoleOf(teacher);
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
    }
    
}
