package org.eddie;

import org.eddie.dto.*;

/**
 * Creates students, teaches, courses and departments
 * @author Edouard Slive
 */


public class Main {

    public static void main(String[] args) {
        SchoolManagementSystem system = new SchoolManagementSystem();
        system.printCourses();

        system.addDepartment("Computer");
        system.printStudents();
        system.addStudent("Eddie", "Slive", "Computer");


        system.addTeacher("Joshua","Slive", "Computer");

        system.addCourse("Intro to Programming", 2.3, "Computer");
        system.addCourse("Intro to College Level English", 2.3, "Computer");
        System.out.println(system.findcourse("C001"));

        system.registerCourse("S001", "C001");
        System.out.println(system.findStudent("S001"));











    }
}