package org.eddie.dto;

import lombok.ToString;

@ToString
/**
 * Java class for a student
 *
 */
public class Student {
    public String name;
    public String fname;
    public String lname;
    public Course[] courses = new Course[5];
    public int courseNum;
    public String id;
    public String department;

    /**
     * Constructor for the student
     * @param fname student's first name
     * @param lname student's last name
     * @param department student's department
     */
    public Student(String fname, String lname, String department) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
    }

}
