package core.factories;

import interfaces.Employee;
import interfaces.EventHandler;
import interfaces.Job;
import models.JobImpl;

/**
 * Created by Vili on 7/29/2016.
 */
public class JobFactory {
    public static Job prduceJob(String name, int workingHours, Employee employee, EventHandler eventHandler){
        return new JobImpl(name,workingHours,employee,eventHandler);
    }
}
