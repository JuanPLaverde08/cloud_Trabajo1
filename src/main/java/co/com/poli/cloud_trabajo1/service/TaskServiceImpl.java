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
        System.out.println(projectIdentifier);
        return repository.getTasksByProject(projectIdentifier);
    }
}
