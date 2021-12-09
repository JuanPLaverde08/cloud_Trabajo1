package co.com.poli.cloud_trabajo1.service;

import co.com.poli.cloud_trabajo1.entities.*;
import co.com.poli.cloud_trabajo1.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BacklogServiceImpl implements BacklogService {

    @Autowired
    private BacklogRepository repository;

    @Override
    public List<Backlog> findAll() {
        return repository.findAll();
    }

    @Override
    public Backlog create(Backlog backlog) {
        return repository.save(backlog);
    }
}
