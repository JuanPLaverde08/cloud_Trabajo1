package co.com.poli.cloud_trabajo1.service;

import co.com.poli.cloud_trabajo1.entities.*;
import co.com.poli.cloud_trabajo1.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectServiceImpl implements  ProyectService{

    @Autowired
    private ProjectRepository repository;

    @Override
    public List<Project> findAll() {
        return repository.findAll();
    }

    @Override
    public Project create(Project proyect) {
        return repository.save(proyect);
    }
}
