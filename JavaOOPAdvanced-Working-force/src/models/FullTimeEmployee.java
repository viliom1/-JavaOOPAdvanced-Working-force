package models;

import interfaces.Employee;

/**
 * Created by Vili on 29-Jul-16.
 */
public class FullTimeEmployee implements Employee {
    private String name;
    private final int WORKING_HOURS_PER_WEEK = 40;

    public FullTimeEmployee(String name) {
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
