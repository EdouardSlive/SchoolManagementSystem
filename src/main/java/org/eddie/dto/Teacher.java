package org.eddie.dto;

import lombok.ToString;

@ToString
/**
 * Class for a teacher
 */
public class Teacher {
    private String name;
    private String lname;
    private String fname;
    private Department department;
    private String id;

    public Teacher(String name, String lname, String fname, Department department, String id) {
        this.name = name;
        this.lname = lname;
        this.fname = fname;
        this.department = department;
        this.id = id;
    }
}
