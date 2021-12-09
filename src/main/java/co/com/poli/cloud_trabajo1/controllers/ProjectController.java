package co.com.poli.cloud_trabajo1.controllers;

import co.com.poli.cloud_trabajo1.entities.Project;
import co.com.poli.cloud_trabajo1.entities.ProjectTask;
import co.com.poli.cloud_trabajo1.service.ProyectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private ProyectService service;

	@GetMapping
	public List<Project> findAll() {
		return service.findAll();
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public Project create(@RequestBody Project project, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Wrong parameter provided");
		}

		if (!service.isNewProject(project)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "This project already exists");
		}
		return service.create(project);
	}

	@GetMapping("/{id}/task")
	public List<ProjectTask> getTasksByProject(@PathVariable String id) {
		return new ArrayList<ProjectTask>();
	}
}
