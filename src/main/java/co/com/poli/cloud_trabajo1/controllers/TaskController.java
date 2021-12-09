package co.com.poli.cloud_trabajo1.controllers;

import co.com.poli.cloud_trabajo1.entities.ProjectTask;
import co.com.poli.cloud_trabajo1.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping
    public List<ProjectTask> findAll() {
        return service.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ProjectTask create(@RequestBody ProjectTask projectTask, BindingResult bindingResult) {
		    if (bindingResult.hasErrors()) {
			      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Wrong parameter provided");
		    }

		    if (!service.isNewTask(projectTask)) {
			      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "This task already exists");
		    }

        return service.create(projectTask);
    }

    @GetMapping("/project/{projectIdentifier}")
    public List<ProjectTask> getTasksByProject(@PathVariable String projectIdentifier) {
        if (projectIdentifier == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Project identifier is required");
        }

        return service.getTasksByProject(projectIdentifier);
    }
}
