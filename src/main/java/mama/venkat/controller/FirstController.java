package mama.venkat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping
	public String getmethod() {
		return "Yo man Chill man";
	}
}
