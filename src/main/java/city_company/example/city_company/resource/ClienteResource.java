package city_company.example.city_company.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import city_company.example.city_company.entities.Cliente;
import city_company.example.city_company.reposotories.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll(){
		List<Cliente> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	public Cliente adicionar(Cliente cliente) {
		return 
	}

}
