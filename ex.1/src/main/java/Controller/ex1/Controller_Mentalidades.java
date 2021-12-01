package Controller.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidades")

public class Controller_Mentalidades {
	@GetMapping
	public String mentalidades()
	{
		return "Orientação ao Futuro \n"+"Responsabilidade Pessoal \n"+
	"Mentalidade de Crescimento \n"+"Persistência";
	}

}
