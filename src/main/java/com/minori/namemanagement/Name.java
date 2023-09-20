package com.minori.namemanagement;

public class Name {
    private int id;
    private String name;

    public Name(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Name() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
