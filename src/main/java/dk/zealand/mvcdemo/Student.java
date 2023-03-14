package dk.zealand.mvcdemo;

import java.io.Serializable;

public class Student implements Serializable {
    public Integer id;
    public String name;
    // standard contructors, getters, and setters


    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}