package org.example.model;

public class Student extends Human {
    public Student(String name, String surname, String patronymic, Sex sex) {
        super(name, surname, patronymic, sex);
    }

    public String getName() {
        return super.getName();
    }

    public String getSurname() {
        return super.getSurname();
    }
}
