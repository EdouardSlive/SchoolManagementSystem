package org.eddie.dto;

import lombok.ToString;

/**
 * Class for a course
 */
@ToString
public class Course {
    private double credit;
    private String id;
    private String[] students = new String[30];
    private Department department;
    private int studentNum;
    private Teacher teacher;

    public Course(double credit, String id, String[] students, Department department, int studentNum, Teacher teacher) {
        this.credit = credit;
        this.id = id;
        this.students = students;
        this.department = department;
        this.studentNum = studentNum;
        this.teacher = teacher;
    }
}
