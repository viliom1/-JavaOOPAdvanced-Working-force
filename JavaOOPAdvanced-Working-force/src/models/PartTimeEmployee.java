package models;

import interfaces.Employee;

/**
 * Created by Vili on 29-Jul-16.
 */
public class PartTimeEmployee implements Employee {
    private String name;
    private final int WORKING_HOURS_PER_WEEK = 20;

    public PartTimeEmployee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getWorkHoursPerWeek() {
        return this.WORKING_HOURS_PER_WEEK;
    }
}
