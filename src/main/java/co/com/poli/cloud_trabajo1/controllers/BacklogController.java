package co.com.poli.cloud_trabajo1.controllers;

import co.com.poli.cloud_trabajo1.service.BacklogService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.poli.cloud_trabajo1.entities.Backlog;
import java.util.List;

@RestController
@RequestMapping("/backlog")
public class BacklogController {

    @Autowired
    private BacklogService service;

    @GetMapping
    public List<Backlog> findAll() {
        return service.findAll();
    }

    @PostMapping
    public Backlog create(@RequestBody Backlog backlog){
        return service.create(backlog);
    }
}
