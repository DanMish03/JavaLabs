package org.example.controller;

import org.example.model.*;

public class Run {
    public static void main(String[] args) {
        createTypicalUniversity();
    }

    public static void createTypicalUniversity() {
        // Створення університету
        University university = new University("Dnipro University of Technology");

        // Створення факультету
        FacultyCreator facultyCreator = new FacultyCreator();
        Faculty faculty = facultyCreator.createFaculty("Faculty of IT");

        // Створення кафедри
        Department department = new Department("Department of software and computer systems");

        // Створення групи
        GroupCreator groupCreator = new GroupCreator();
        Group group = groupCreator.createGroup("Group 121-20-2");

        // Створення студентів
        StudentCreator studentCreator = new StudentCreator();
        Student student1 = studentCreator.createStudent("Dan", "Mish", "Ruslanovych", Sex.MALE);
        Student student2 = studentCreator.createStudent("Mary", "Smith", "Doe", Sex.FEMALE);
        Student student3 = studentCreator.createStudent("Jhon", "Fomenko", "Jhonson", Sex.MALE);

        // Додавання студентів до групи
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);

        // Додавання групи до кафедри
        department.addGroup(group);

        // Додавання кафедри до факультету
        faculty.addDepartment(department);

        // Додавання факультету до університету
        university.addFaculty(faculty);

        // Вивід створеного університету
        System.out.println("University: " + university.getName());
        for (Faculty f : university.getFaculties()) {
            System.out.println("Faculty: " + f.getName());
            for (Department d : f.getDepartments()) {
                System.out.println("Department: " + d.getName());
                for (Group g : d.getGroups()) {
                    System.out.println("Group: " + g.getName());
                    for (Student s : g.getStudents()) {
                        System.out.println("Student: " + s.getName() + " " + s.getSurname());
                    }
                }
            }
        }
    }
}
