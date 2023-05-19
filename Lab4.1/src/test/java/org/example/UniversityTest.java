package org.example;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import org.example.controller.*;
import org.example.model.*;


public class UniversityTest {

    @Test
    public void testUniversityEquality() {
        University oldUniversity = createTypicalUniversity();

        // Запис університету в файл у форматі JSON
        String filePath = "university.json";
        JsonManager jsonManager = new JsonManager();
        jsonManager.writeUniversityToJsonFile(oldUniversity, filePath);

        // Зчитування університету з файлу у форматі JSON
        University newUniversity = jsonManager.readUniversityFromJsonFile(filePath);

        // Порівняння oldUniversity та newUniversity за допомогою методу equals
        Assertions.assertEquals(oldUniversity, newUniversity);
    }

    private University createTypicalUniversity() {
        University university = new University("My University");

        FacultyCreator facultyCreator = new FacultyCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        GroupCreator groupCreator = new GroupCreator();
        StudentCreator studentCreator = new StudentCreator();

        Faculty faculty1 = facultyCreator.createFaculty("Faculty of Science");
        Faculty faculty2 = facultyCreator.createFaculty("Faculty of Arts");

        Department department1 = departmentCreator.createDepartment("Department of Physics");
        Department department2 = departmentCreator.createDepartment("Department of Chemistry");
        Department department3 = departmentCreator.createDepartment("Department of Literature");
        Department department4 = departmentCreator.createDepartment("Department of History");

        Group group1 = groupCreator.createGroup("Group A");
        Group group2 = groupCreator.createGroup("Group B");
        Group group3 = groupCreator.createGroup("Group C");
        Group group4 = groupCreator.createGroup("Group D");
        Group group5 = groupCreator.createGroup("Group E");
        Group group6 = groupCreator.createGroup("Group F");
        Group group7 = groupCreator.createGroup("Group G");
        Group group8 = groupCreator.createGroup("Group H");

        studentCreator.createStudent("John", "Doe", "Johnson", Sex.MALE);
        studentCreator.createStudent("Mary", "Smith", "Johnson", Sex.FEMALE);


        return university;
    }
}
