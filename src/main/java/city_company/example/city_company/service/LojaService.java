package city_company.example.city_company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import city_company.example.city_company.entities.Loja;
import city_company.example.city_company.reposotories.LojaRepository;

@Service
public class LojaService {
	
	@Autowired
	private LojaRepository lojaRepository;
	
	public List<Loja> findAll(){
		return lojaRepository.findAll();
	}
	
	public Loja findById(Long id) {
		Optional<Loja> obj = lojaRepository.findById(id);
		return obj.orElseThrow();
		}
	
	public Loja insert(Loja obj) {
		return lojaRepository.save(obj);
	}

}
