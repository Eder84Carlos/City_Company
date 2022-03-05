package city_company.example.city_company.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import city_company.example.city_company.entities.Loja;
import city_company.example.city_company.service.LojaService;

@RestController
@RequestMapping("/lojas")
public class LojaResource {
	
	@Autowired
	private LojaService lojaService;
	
	@GetMapping
	public List<Loja> listar(){
		return lojaService.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Loja adicionar(@RequestBody Loja loja) {
		return lojaService.insert(loja);
	}

}
