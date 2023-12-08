package org.eddie.dto;

import lombok.ToString;

@ToString
/**
 * Java class for a student
 */
public class Student {
    public String name;
    public String fname;
    public String lname;
    public String[] courses = new String[5];
    public int courseNum;
    public String id;
    private int nextId;
    private Department department;

    public Student(String fname, String lname, Department department) {
        this.name = name;
        this.fname = fname;
        this.lname = lname;
        this.courses = courses;
        this.courseNum = courseNum;
        this.id = id;
        this.nextId = nextId;
        this.department = department;
    }

}
