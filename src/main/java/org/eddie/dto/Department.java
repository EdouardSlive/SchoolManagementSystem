package org.eddie.dto;

import lombok.ToString;

@ToString
/**
 * Class for a department
 */

public class Department {
    private String id;
    private int nextid;
    private String departmentName;

    public Department(String id, int nextid, String departmentName) {
        this.id = id;
        this.nextid = nextid;
        this.departmentName = departmentName;
    }
}
