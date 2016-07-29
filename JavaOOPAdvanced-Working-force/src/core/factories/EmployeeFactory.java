package core.factories;

import interfaces.Employee;
import models.FullTimeEmployee;
import models.PartTimeEmployee;

/**
 * Created by Vili on 29-Jul-16.
 */
public class EmployeeFactory {

    public static Employee produceStandartEmployee(String name){
        return new FullTimeEmployee(name);
    }

    public static Employee producePartTimeEmployee(String name){
        return new PartTimeEmployee(name);
    }

}
