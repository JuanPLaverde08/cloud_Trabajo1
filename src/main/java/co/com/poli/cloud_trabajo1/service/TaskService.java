package co.com.poli.cloud_trabajo1.service;

import co.com.poli.cloud_trabajo1.entities.ProjectTask;
import java.util.List;

public interface TaskService {

    List<ProjectTask> findAll();

    List<ProjectTask> getTasksByProject(String projectIdentifier);

    ProjectTask create(ProjectTask proyectTask);

    boolean isNewTask(ProjectTask task);

    double getTasksByProjectHours(String projectIdentifier);

    double getTasksHoursByProjectAndStatus(String projectIdentifier, String status);

}
