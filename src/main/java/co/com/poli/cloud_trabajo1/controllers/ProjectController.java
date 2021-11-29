package co.com.poli.cloud_trabajo1.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@GetMapping()
	public String getAll() {
		// return projects, JSON
		return String.format("Hello %s :)", "some");
	}
}
