package co.com.poli.cloud_trabajo1.controllers;

import co.com.poli.cloud_trabajo1.service.BacklogService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.poli.cloud_trabajo1.entities.Backlog;
import org.springframework.web.server.ResponseStatusException;

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
    public Backlog create(@RequestBody Backlog backlog, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Wrong parameter provided");
        }

        return service.create(backlog);
    }
}
