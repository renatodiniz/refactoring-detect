package br.com.ufmg.spring.jpa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_COMMIT")
public class Commit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CO_COMMIT")
	private Integer id;

	@Column(name = "DS_AUTOR")
	private String autor;
	
	@Column(name = "DT_COMMIT")
	private Date data;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CO_PROJETO")
	private Projeto projeto;
	
	public Commit() {}

	public Commit(Integer id, String autor, Date data, Projeto projeto) {
		super();
		this.id = id;
		this.autor = autor;
		this.data = data;
		this.projeto = projeto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}	

}
