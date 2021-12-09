package co.com.poli.cloud_trabajo1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(Model model) {
		return "home";
	}
}
