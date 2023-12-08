package org.eddie.dto;

import lombok.ToString;

@ToString
/**
 * Class for a department
 */

public class Department {
    public String id;
    public String departmentName;

    public Department(String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }
}
