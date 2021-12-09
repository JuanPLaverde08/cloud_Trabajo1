package co.com.poli.cloud_trabajo1.service;

import co.com.poli.cloud_trabajo1.entities.ProjectTask;
import java.util.List;

public interface TaskService {

    List<ProjectTask> findAll();
    ProjectTask create(ProjectTask proyectTask);
    boolean isNewTask(ProjectTask task);
    List<ProjectTask> getTasksByProject(String projectIdentifier);
    // ProjectTask findByStatus(String status, String projectIdentifier);
    // boolean     delete(Long id, String projectIdentifier);

}
