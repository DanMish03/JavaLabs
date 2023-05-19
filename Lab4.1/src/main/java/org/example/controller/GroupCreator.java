package org.example.controller;

import org.example.model.Group;

public class GroupCreator {
    public Group createGroup(String name) {
        return new Group(name);
    }
}
