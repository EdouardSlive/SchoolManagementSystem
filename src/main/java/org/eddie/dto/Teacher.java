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
    public String department;
    public String id;

    /**
     * Constructor for the teacher
     * @param fname teacher's first name
     * @param lname teacher's last name
     * @param department teacher's department
     */
    public Teacher(String fname, String lname, String department) {
        this.lname = lname;
        this.fname = fname;
        this.department = department;
    }
}
