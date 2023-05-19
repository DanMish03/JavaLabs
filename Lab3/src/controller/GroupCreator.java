package controller;

import model.Group;

public class GroupCreator {
    public Group createGroup(String name) {
        return new Group(name);
    }
}
