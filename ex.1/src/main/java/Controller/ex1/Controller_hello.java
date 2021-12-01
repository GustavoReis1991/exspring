package Controller.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class Controller_hello {
	@GetMapping
	public String hello()
	{
		return "Hello World";
	}

}
