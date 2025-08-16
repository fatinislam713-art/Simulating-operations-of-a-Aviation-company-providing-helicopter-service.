package com.example.helicopterservice_2321523.model;


public abstract class User {
    protected final String id;
    protected String name;
    protected final String role;

    protected User(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }

    @Override
    public String toString() {
        return role + "{" + "id='" + id + '\'' + ", name='" + name + '\'' + '}';
    }
}
