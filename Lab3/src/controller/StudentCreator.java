package controller;

import model.Human;
import model.Sex;
import model.Student;

public class StudentCreator {
    public Student createStudent(String name, String surname, String patronymic, Sex sex) {
        return new Student(name, surname, patronymic, sex);
    }
}
