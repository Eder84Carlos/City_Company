package city_company.example.city_company.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Loja {
	
	private Long id;
	private String nome;
	private String email;
	private Integer telefone;
	
	public Loja() {
	}

	public Loja(Long id, String nome, String email, Integer telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	@JsonIgnore
	@OneToMany(mappedBy = "Lista_Cliente")
	private List<Cliente> clients = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loja other = (Loja) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
