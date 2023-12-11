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

    /**
     * Method to add a student
     * @param fname student's first name
     * @param lname student's last name
     * @param department student's department
     */
    public void addStudent(String fname, String lname, String department) {
        if (nextIdStudent < 200) {
            Student newStudent = new Student(fname, lname, department);
            students[nextIdStudent] = newStudent;
            newStudent.id = String.format("S%03d", nextIdStudent);
            nextIdStudent++;
            newStudent.courseNum = 0;
            newStudent.courses = new Course[5];
            newStudent.name = fname + " " + lname;
        } else {
            System.out.println("Max students reached, add student failed");
        }
    }

    /**
     * Method to add a teacher
     * @param fname teacher's first name
     * @param lname teacher's last name
     * @param department teacher's department
     */
    public void addTeacher(String fname, String lname, String department) {
        if (nextIdTeacher < 20) {
            Teacher newTeacher = new Teacher(fname, lname, department);
            teachers[nextIdTeacher] = newTeacher;
            newTeacher.id = String.format("T%03d", nextIdTeacher);
            nextIdTeacher++;
            newTeacher.name = fname + " " + lname;
        } else {
            System.out.println("Max teachers reached, add teacher failed");
        }
    }

    /**
     * Method to add a department
     * @param departmentName department's name
     */
    public void addDepartment(String departmentName) {
        if (nextIdDepartment < 5) {
            Department newDepartment = new Department(departmentName);
            departments[nextIdDepartment] = newDepartment;
            newDepartment.id = String.format("D%03d", nextIdDepartment);
            nextIdDepartment++;
        } else {
            System.out.println("Max departments reached, add departments failed");
        }


    }

    /**
     * Method to add a course
     * @param courseName course's name
     * @param credit course's number of credits
     * @param department course's department
     */
    public void addCourse(String courseName, double credit, String department) {
        if (nextIdCourse < 30) {
            Course newCourse = new Course(courseName, credit, department);
            courses[nextIdCourse] = newCourse;
            newCourse.id = String.format("C%03d", nextIdCourse);
            nextIdCourse++;
        } else {
            System.out.println("Max courses reached, add course failed");
        }
    }

    /**
     * Method to identify a student based on their id
     * @param id the student's id in order to identify them
     * @return the student
     */
    public Student findStudent(String id) {
        for (int i = 1; i < nextIdStudent; i++) {
            if (students[i] != null && students[i].id.equals(id)) {
                return students[i];
            }
        }
        return null;
    }

    /**
     * Method to identify a teacher based on their id
     * @param id the teacher's id in order to identify them
     * @return the teacher
     */
    public Teacher findTeacher(String id) {
        for (int i = 1; i < nextIdTeacher; i++) {
            if (teachers[i] != null && teachers[i].id.equals(id)) {
                return teachers[i];
            }
        }
        return null;
    }

    /**
     * Method to identify a course based on its id
     * @param id the course's id in order to identify it
     * @return the course
     */
    public Course findcourse(String id) {
        for (int i = 1; i < nextIdCourse; i++) {
            if (courses[i] != null && courses[i].id.equals(id)) {
                return courses[i];
            }
        }
        return null;
    }

    /**
     * Method to identify a department based on its id
     * @param id the department's id in order to identify it
     * @return the department
     */
    public Department findDepartment(String id) {
        for (int i = 1; i < nextIdDepartment; i++) {
            if (departments[i] != null && departments[i].id.equals(id)) {
                return departments[i];
            }
        }
        return null;
    }

    /**
     * Method to print all the teachers in the system
     */
    public void printTeachers() {
        String teachersList = "";
        for (int i = 1; i < nextIdTeacher; i++) {
            teachersList += teachers[i];
            if (i + 1 < nextIdTeacher) {
                teachersList += ", ";
            }
        }
        System.out.println(teachersList);
        }

    /**
     * Method to print all the students in the system
     */
    public void printStudents() {
        String studentsList = "";
        for (int i = 1; i < nextIdStudent; i++) {
            studentsList += students[i];
            if (i + 1 < nextIdStudent) {
                studentsList += ", ";
            }
        }
        System.out.println(studentsList);
    }

    /**
     * Method to print all the courses in the system
     */
    public void printCourses() {
        String coursesList = "";
        for (int i = 1; i < nextIdCourse; i++) {
            if (courses[i] !=null) {
                coursesList += courses[i];
                if (i + 1 < nextIdCourse) {
                    coursesList += ", ";
                }
            }
        }
        System.out.println(coursesList);
    }

    /**
     * Method to print all the departments in the system
     */
    public void printDepartments() {
        String departmentsList = "";
        for (int i = 1; i < nextIdDepartment; i++) {
            departmentsList += departments[i];
            if (i + 1 < nextIdDepartment) {
                departmentsList += ", ";
            }
        }
        System.out.println(departmentsList);
    }

    /**
     * Method to assign a teacher to a course using both of their id's
     * @param idTeacher teacher's id used to identify them
     * @param idCourse course's id used to identify it
     */
    public void modifyCourseTeacher(String idTeacher, String idCourse) {
        outerloop:
        for (int i = 1; i < nextIdTeacher; i++) {
            if (idTeacher.equals(teachers[i].id) ) {
                for (int e = 1; e < nextIdCourse; e++) {
                    if (idCourse.equals(courses[e].id)) {
                        courses[e].teacher = teachers[e];
                        break outerloop;
                    }
                    }
                System.out.println("No course found with this id");
                }
            else if (i == nextIdTeacher - 1){
                System.out.println("No teacher found with this id");
            }
        }
    }

    /**
     * Method to register a student to a course using both of their id's
     * @param idStudent student's id used to identify them
     * @param idCourse course's id used to identify it
     */
    public void registerCourse(String idStudent, String idCourse) {
        for (int i = 1; i < nextIdStudent; i++) {
            if (idStudent.equals(students[i].id)) {
                if (students[i].courseNum < 5){
                for (int e = 1; e < nextIdCourse; e++) {
                    if (courses[e].studentNum < 5){
                        if (idCourse.equals(courses[e].id)) {
                            for (int a = 0; a < students[i].courseNum; a++)
                                if (students[i].courses[a] == courses[e]) {
                                    System.out.println("Student has already registered for this course");
                                    break;
                                }
                            students[i].courses[students[i].courseNum] = courses[e];
                            courses[e].students[courses[i].studentNum] = students[i].name;
                            students[i].courseNum++;
                        }
                    }
                    else{
                        System.out.println("Class already the maximum amount of students");
                    }

                }
                }
                else {
                    System.out.println("Student has already registered for the maximum amount of classes");
                }
            }
        }
    }
}


