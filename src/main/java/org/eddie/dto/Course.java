package org.eddie.dto;

import lombok.ToString;

/**
 * Class for a course
 */
@ToString
public class Course {
    private double credit;
    public String id;
    private String[] students = new String[30];
    public Department department;
    private int studentNum;
    private Teacher teacher;
    public String courseName;

    public Course(String courseName, double credit, Department department) {
        this.credit = credit;
        this.id = id;
        this.students = students;
        this.department = department;
        this.studentNum = studentNum;
        this.teacher = teacher;
    }
}
