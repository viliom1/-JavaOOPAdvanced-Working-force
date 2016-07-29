package models;

import interfaces.Employee;
import interfaces.EventHandler;
import interfaces.Job;

import java.util.EventObject;

/**
 * Created by Vili on 7/29/2016.
 */
public class JobImpl extends EventObject implements Job {
    private String name;
    private int workingHours;
    private Employee employee;
    EventHandler eventHandler;


    public JobImpl(String name, int workingHours, Employee employee,EventHandler eventHandler) {
        super(eventHandler);
        this.eventHandler = eventHandler;
        this.name = name;
        this.workingHours = workingHours;
        this.employee = employee;

    }

    @Override
    public void update() {
        this.workingHours -= this.employee.getWorkHoursPerWeek();
        if (this.workingHours <=0){
            this.jobDoneEvent();
        }
    }

    @Override
    public Employee getEmnployee() {
        return this.employee;
    }

    @Override
    public int getHoursToComplete() {
        return this.workingHours;
    }

    @Override
    public String getJobName() {
        return this.name;
    }
    private void jobDoneEvent(){
        eventHandler.fireEvent(this);
    }
}
