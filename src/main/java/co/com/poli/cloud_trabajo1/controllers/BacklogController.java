package co.com.poli.cloud_trabajo1.controllers;

import co.com.poli.cloud_trabajo1.service.BacklogService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.poli.cloud_trabajo1.entities.Backlog;
import co.com.poli.cloud_trabajo1.entities.BacklogDTO;
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
    public BacklogDTO create(@RequestBody Backlog backlog, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Wrong parameter provided");
        }
    
        Backlog b = service.create(backlog);
        BacklogDTO dto = new BacklogDTO();
        dto.setProjectIdentifier(b.getProjectIdentifier());
        dto.setProject(b.getProject());
        dto.setProjectTask(b.getProjectTask());
        dto.setTaskCount(b.getProjectTask().size());

        return dto;
    }
}
