package core;

import core.factories.EmployeeFactory;
import core.factories.JobFactory;
import interfaces.Employee;
import interfaces.EventHandler;
import interfaces.WorkStation;
import models.JobHandler;
import models.WorkStationImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Vili on 7/29/2016.
 */
public class Engine {
    private EventHandler handler;
    private WorkStation workStation;
    private List<Employee> employees;

    public Engine() {

        this.workStation = new WorkStationImpl();
        this.employees = new LinkedList<>();
        this.handler = new JobHandler(this.workStation);
    }

    private void addJob(String command) {
        String[] args = command.split("\\s+");
        Employee employee = findEmployee(args[3]);
        this.workStation.addJob(JobFactory.prduceJob(args[1], Integer.parseInt(args[2]), employee, this.handler));
    }

    private void addEmployee(String command) {
        String[] args = command.split("\\s+");
        if (args[0].equals("StandartEmployee")) {
            this.employees.add(EmployeeFactory.produceStandartEmployee(args[1]));
        } else if (args[0].equals("PartTimeEmployee")) {
            this.employees.add(EmployeeFactory.producePartTimeEmployee(args[1]));
        }

    }

    private Employee findEmployee(String arg) {
        for (Employee employee : employees) {
            if (employee.getName().equals(arg)) {
                return employee;
            }
        }
        throw new NoSuchElementException();
    }

    public void executeCommand(String command) {
        String[] args = command.split("\\s+");
        switch (args[0]) {
            case "Job":
                this.addJob(command);
                break;
            case "StandartEmployee":
            case "PartTimeEmployee":
                this.addEmployee(command);
                break;
            case "Pass":
                this.workStation.weekPass();
                break;
            case "Status": //TODO add print status
                break;

        }
    }
}
