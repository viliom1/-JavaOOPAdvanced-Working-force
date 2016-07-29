package interfaces;

/**
 * Created by Vili on 7/29/2016.
 */
public interface WorkStation {
    public void addJob(Job job);

    public void handleEvent(String jobName);

    public void weekPass();



}
