package org.eddie.dto;

import lombok.ToString;

/**
 * Class for a course
 */
@ToString
public class Course {
    public double credit;
    public String id;
    public String[] students = new String[30];
    public String department;
    public int studentNum;
    public Teacher teacher;
    public String courseName;

    /**
     * Constructor for the course
     * @param courseName course's name
     * @param credit course's number of credits
     * @param department course's department
     */
    public Course(String courseName, double credit, String department) {
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
    }
}
