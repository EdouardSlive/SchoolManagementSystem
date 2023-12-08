package org.eddie.dto;

import lombok.ToString;

@ToString
/**
 * Class for a teacher
 */
public class Teacher {
    public String name;
    public String lname;
    public String fname;
    public Department department;
    public String id;

    public Teacher(String fname, String lname, Department department) {
        this.name = name;
        this.lname = lname;
        this.fname = fname;
        this.department = department;
        this.id = id;
    }
}
