package dk.zealand.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		Hest riga = new Hest("Riga", "Oldenbruger", 5);
		model.addAttribute("hestenavn", riga.navn);
		model.addAttribute("hestaalder", riga.alder);
		model.addAttribute("hesterace", riga.race);

		return "greeting";
	}

}