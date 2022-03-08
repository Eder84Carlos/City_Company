package city_company.example.city_company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import city_company.example.city_company.entities.SeguroCarro;
import city_company.example.city_company.reposotories.SeguroCarroRepository;

public class SeguroCarroService {
	
	@Autowired
	private SeguroCarroRepository seguroCarroRepository;
	
	public List<SeguroCarro> findAll(){
		return seguroCarroRepository.findAll();
	}
	
	public SeguroCarro findById(Long id) {
		Optional<SeguroCarro> obj = seguroCarroRepository.findById(id);
		return obj.orElseThrow();
		}
	
	public SeguroCarro insert(SeguroCarro obj) {
		return seguroCarroRepository.save(obj);
	}
	

}
