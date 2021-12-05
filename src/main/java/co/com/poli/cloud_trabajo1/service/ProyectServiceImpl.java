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
    public boolean isNewProject(Project project) {
        List<Project> p = repository.getProjectByNameAndIdentifier(project.getProjectName(), project.getProjectIdentifier());
        return p.isEmpty();
    }

    @Override
    public Project create(Project project) {
        return repository.save(project);
    }
}
