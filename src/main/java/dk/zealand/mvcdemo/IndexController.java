package dk.zealand.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

	@GetMapping("/")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		Hest riga = new Hest("Riga", "Oldenbruger", 5);
		model.addAttribute("hestenavn", riga.navn);
		return "index";
	}

	@GetMapping("/listStudents")
	public String listStudent(Model model) {
		model.addAttribute("students", StudentUtils.buildStudents());
		return "klasse"; // Navnet på Viewet dvs html filen
	}

}