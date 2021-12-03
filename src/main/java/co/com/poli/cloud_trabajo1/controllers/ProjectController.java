package co.com.poli.cloud_trabajo1.controllers;

import co.com.poli.cloud_trabajo1.service.ProyectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.com.poli.cloud_trabajo1.entities.Project;
import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private ProyectService service;

	@GetMapping
	public List<Project> findAll(){
		return service.findAll();
	}

	@PostMapping
	public Project create(@RequestBody Project project){
		return service.create(project);
	}

}
