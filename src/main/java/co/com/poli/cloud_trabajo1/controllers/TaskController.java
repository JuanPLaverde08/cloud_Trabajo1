package co.com.poli.cloud_trabajo1.controllers;

import co.com.poli.cloud_trabajo1.entities.ProjectTask;
import co.com.poli.cloud_trabajo1.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {

    private TaskService service;

    @PostMapping
    public ProjectTask create(@RequestBody ProjectTask projectTask){
        return service.create(projectTask);
    }

}
