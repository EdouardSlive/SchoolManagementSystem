package org.eddie.dto;

public class SchoolManagementSystem {
    public Student[] students = new Student[200];
    public Teacher[] teachers = new Teacher[20];
    public Department[] departments = new Department[5];
    public Course[] courses = new Course[30];
    public int nextIdStudent = 1;
    public int nextIdTeacher = 1;
    public int nextIdDepartment = 1;
    public int nextIdCourse = 1;


    private void addStudent(String fname, String lname, Department department){
        if (!(nextIdStudent > 200)) {
            Student newStudent = new Student(fname, lname, department);
            newStudent.id = String.format("S%00d", nextIdStudent);
            nextIdStudent++;
            newStudent.courseNum = 0;
            newStudent.courses = new String[newStudent.courseNum];
            newStudent.name = fname + " " + lname;
        }
        else{
            System.out.println("Max students reached, add student failed");
        }
    }
    private void addTeacher(String fname, String lname, Department department) {
        if (!(nextIdTeacher > 20)) {
            Teacher newTeacher = new Teacher(fname, lname, department);
            newTeacher.id = String.format("T%00d", nextIdTeacher);
            nextIdTeacher++;
            newTeacher.name = fname + " " + lname;
        }
        else {
            System.out.println("Max teachers reached, add teacher failed");
        }
    }
    private void addDepartment(String departmentName){
        if (!(nextIdDepartment > 5)) {
            Department newDepartment = new Department(departmentName);
            newDepartment.id = String.format("D%00d", nextIdDepartment);
            nextIdDepartment++;
        }
        else {
            System.out.println("Max departments reached, add departments failed");
        }


    }
    private void addCourse(String courseName, double credit, Department department){
        if (!(nextIdCourse > 5)) {
            Course newCourse = new Course(courseName, credit, department);
            newCourse.id = String.format("C%00d", nextIdDepartment);
            nextIdCourse++;
        }
        else {
            System.out.println("Max departments reached, add departments failed");
        }
    }
    private Student findStudent(String name) {
        for (int i = 0; i < nextIdStudent; i++) {
            if (students[i].name == name) {
                return students[i];
            }
        }
        return null;
    }
    private Teacher findTeacher(String name) {
        for (int i = 0; i < nextIdTeacher; i++) {
            if (teachers[i].name == name) {
                return teachers[i];
            }
        }
        return null;
    }
    private Course findcourse(String courseName) {
        for (int i = 0; i < nextIdCourse; i++) {
            if (courses[i].courseName == courseName) {
                return courses[i];
            }
        }
        return null;
    }
    private Department findDepartment(String departmentName) {
        for (int i = 0; i < nextIdDepartment; i++) {
            if (departments[i].departmentName == departmentName) {
                return departments[i];
            }
        }
        return null;
    }
}

