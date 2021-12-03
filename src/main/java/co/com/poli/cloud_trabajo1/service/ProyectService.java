package co.com.poli.cloud_trabajo1.service;

import co.com.poli.cloud_trabajo1.entities.*;

import java.util.List;

public interface ProyectService {

    boolean isNewProject(Project proyect);
    List<Project> findAll();
    Project create(Project proyect);

}
