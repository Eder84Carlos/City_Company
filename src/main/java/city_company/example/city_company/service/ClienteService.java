package city_company.example.city_company.service;

import java.util.List;
import java.util.Optional;

import city_company.example.city_company.entities.Cliente;
import city_company.example.city_company.reposotories.ClienteRepository;

public class ClienteService {
	
	private ClienteRepository repository;
	
	public List<Cliente> findAll(){
		return repository.findAll();
	}
	
	public Cliente findById(Long id) {
		Optional<Cliente> obj = repository.findById(id);
		return obj.orElseThrow();
		}
	
	public Cliente insert(Cliente obj) {
		return repository.save(obj);
	}

}
