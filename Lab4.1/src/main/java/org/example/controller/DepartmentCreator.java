package org.example.controller;

import org.example.model.Department;
public class DepartmentCreator {

    public Department createDepartment(String name) {
        return new Department(name);
    }
}

