package ca.lambton.week7fall2022;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerExampler {

	@GetMapping("/helloworld")
	public String helloWorld() {
		return "helloworld";
	}
}
