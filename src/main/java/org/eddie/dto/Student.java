package org.eddie.dto;

import lombok.ToString;

@ToString
/**
 * Java class for a student
 */
public class Student {
    private String name;
    private String fname;
    private String lname;
    private String[] courses = new String[5];
    private int courseNum;
    private String Id;
    private int nextId;
    private Department department;

    public Student(String name, String fname, String lname, String[] courses, int courseNum, String id, int nextId, Department department) {
        this.name = name;
        this.fname = fname;
        this.lname = lname;
        this.courses = courses;
        this.courseNum = courseNum;
        Id = id;
        this.nextId = nextId;
        this.department = department;
    }
}
