package ru.gb.oseminar.data;

import java.time.LocalDate;

public class Professor extends Teacher{

    public String degree;

    public Professor(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long teacherId, String degree) {
        super(firstName, secondName, patronymic, dateOfBirth, teacherId);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return  "Professor{" +
                "teacherId =" + super.getTeacherId() +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getPatronymic() + '\'' +
                ", degree='" + degree + '\'' +
                "}\n";
    }
}
