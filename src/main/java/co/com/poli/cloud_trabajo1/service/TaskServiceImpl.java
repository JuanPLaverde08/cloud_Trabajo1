package co.com.poli.cloud_trabajo1.service;

import co.com.poli.cloud_trabajo1.entities.*;
import co.com.poli.cloud_trabajo1.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private ProjectTaskRepository repository;

    @Override
    public List<ProjectTask> findAll() {
        return repository.findAll();
    }

    @Override
    public boolean isNewTask(ProjectTask task) {
        List<ProjectTask> pt = repository.getTaskByNameAndProject(task.getName(), task.getProjectIdentifier());
        return pt.isEmpty();
    }

    @Override
    public ProjectTask create(ProjectTask proyectTask) {
        return repository.save(proyectTask);
    }

    @Override
    public List<ProjectTask> getTasksByProject(String projectIdentifier) {
        return repository.getTasksByProject(projectIdentifier);
    }

    @Override
    public double getTasksByProjectHours(String projectIdentifier) {
        List<ProjectTask> tasks = repository.getTasksByProject(projectIdentifier);
        double hours = 0;
        for (int i = 0; i < tasks.size(); i++) {
            hours += tasks.get(i).getHours();
        }
        return hours;
    }

    @Override
    public double getTasksHoursByProjectAndStatus(String projectIdentifier, String status) {
        List<ProjectTask> tasks = repository.getTasksByProject(projectIdentifier);
        double hours = 0;
        for (int i = 0; i < tasks.size(); i++) {
            ProjectTask task = tasks.get(i);
            if (task.getStatus().equals(status)) {
                hours += task.getHours();
            }
        }
        return hours;
    }

}
