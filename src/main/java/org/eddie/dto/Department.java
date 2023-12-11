package org.eddie.dto;

import lombok.ToString;

@ToString
/**
 * Class for a department
 */

public class Department {
    public String id;
    public String departmentName;

    /**
     * Constructor for the department
     * @param departmentName department's name
     */
    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
}
