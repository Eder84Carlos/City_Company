package city_company.example.city_company.reposotories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import city_company.example.city_company.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long>{

	Cliente delete(Long id);

}
