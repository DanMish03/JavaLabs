package controller;

import model.Faculty;

public class FacultyCreator {
    public Faculty createFaculty(String name) {
        return new Faculty(name);
    }
}
