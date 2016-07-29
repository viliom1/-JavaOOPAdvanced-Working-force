package models;

import interfaces.EventHandler;
import interfaces.Job;
import interfaces.WorkStation;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vili on 7/29/2016.
 */
public class WorkStationImpl implements WorkStation {
    private List<Job> jobs;

    public WorkStationImpl() {
        this.jobs = new LinkedList<>();
    }

    @Override
    public void addJob(Job job) {
        this.jobs.add(job);
    }

    @Override
    public void handleEvent(String job) {
        this.removeJob(job);
        System.out.println("Job " + job + " done!");
    }

    @Override
    public void weekPass() {
        for (Job job : jobs) {
            job.update();
        }
    }

    private void removeJob(String jobName) {
        for (Job job : this.jobs) {
            if (jobName.equals(job.getJobName())){
                jobs.remove(job);
                break;
            }
        }
    }
}
