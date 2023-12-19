package ru.gb.oseminar.view;

import java.util.List;

import ru.gb.oseminar.data.Teacher;

public class TeacherView implements UserView<Teacher>{

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }

    public void sendOnConsoleOf(Teacher teacher){
        System.out.println(teacher);
    }
}
