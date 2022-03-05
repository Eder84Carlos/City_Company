package city_company.example.city_company.reposotories;

import org.springframework.data.jpa.repository.JpaRepository;

import city_company.example.city_company.entities.Loja;


public interface LojaRepository  extends JpaRepository <Loja, Long>{

}
