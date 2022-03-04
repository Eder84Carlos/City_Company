package city_company.example.city_company.reposotories;

import org.springframework.data.jpa.repository.JpaRepository;

import city_company.example.city_company.entities.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long>{

}
