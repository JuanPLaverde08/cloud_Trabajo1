package co.com.poli.cloud_trabajo1.service;

import co.com.poli.cloud_trabajo1.entities.*;

import java.util.List;

public interface BacklogService {
    List<Backlog> findAll();
    Backlog create(Backlog backlog);
}
