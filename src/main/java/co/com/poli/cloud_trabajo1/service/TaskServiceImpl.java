package co.com.poli.cloud_trabajo1.service;

import co.com.poli.cloud_trabajo1.entities.*;
import co.com.poli.cloud_trabajo1.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class TaskServiceImpl implements  TaskService{

    @Autowired
    private ProjectTaskRepository repository;

    @Override
    public ProjectTask create(ProjectTask proyectTask) {
        return repository.save(proyectTask);
    }

}
