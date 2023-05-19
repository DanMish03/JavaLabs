package org.example.controller;

import org.example.model.Sex;
import org.example.model.Student;

public class StudentCreator {
    public Student createStudent(String name, String surname, String patronymic, Sex sex) {
        return new Student(name, surname, patronymic, sex);
    }
}
