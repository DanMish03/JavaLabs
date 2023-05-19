package org.example.controller;

import org.example.model.Faculty;

public class FacultyCreator {
    public Faculty createFaculty(String name) {
        return new Faculty(name);
    }
}
