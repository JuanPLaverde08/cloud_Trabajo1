package co.com.poli.cloud_trabajo1.controllers;

import co.com.poli.cloud_trabajo1.service.BacklogService;
import org.springframework.web.bind.annotation.*;

import co.com.poli.cloud_trabajo1.entities.Backlog;

@RestController
@RequestMapping("/backlog")
public class BacklogController {

    private BacklogService service;

    @PostMapping
    public Backlog create(@RequestBody Backlog backlog){
        return service.create(backlog);
    }
}
