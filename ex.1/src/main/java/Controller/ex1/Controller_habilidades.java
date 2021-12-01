package Controller.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")

public class Controller_habilidades {
	@GetMapping
	public String habilidades()
	{
		return "Trabalho em Equipe \n"+"Atenção aos Detalhes \n"+
	"Proatividade \n"+"Comunicação";
	}

}
