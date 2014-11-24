package br.com.ufmg.spring.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PROJETO")
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CO_PROJETO")
	private Integer id;

	@Column(name = "DS_NOME")
	private String nome;
	
	public Projeto() {};

	public Projeto(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	

}
