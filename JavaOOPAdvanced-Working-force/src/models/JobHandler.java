package models;

import interfaces.EventHandler;
import interfaces.Job;
import interfaces.WorkStation;

/**
 * Created by Vili on 7/29/2016.
 */
public class JobHandler implements EventHandler{
    private WorkStation workStation;

    public JobHandler(WorkStation workStation) {
        this.workStation = workStation;
    }

    @Override
    public void fireEvent(Job event) {
        workStation.handleEvent(event.getJobName());
    }
}
