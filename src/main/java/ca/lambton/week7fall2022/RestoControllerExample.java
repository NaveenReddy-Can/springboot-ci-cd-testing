package ca.lambton.week7fall2022;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestoControllerExample {

	@GetMapping("/person/{name}")
	public List<Person> getPersonExample(@PathVariable String name) {
		List<Person> toReturn = new ArrayList<>();
		toReturn.add(new Person(name, 22));
		toReturn.add(new Person("jane smith", 24));
		return toReturn;
	}
}
