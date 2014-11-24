package br.com.ufmg.spring.jpa;

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
@Table(name = "TB_REFACTORING")
public class Refactoring {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CO_REFACTORING")
	private Integer id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CO_COMMIT")
	private Commit commit;

	@Column(name = "ST_TIPO")
	private String tipo;

	
	public Refactoring() {}

	public Refactoring(Integer id, Commit commit, String tipo) {
		super();
		this.id = id;
		this.commit = commit;
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Commit getCommit() {
		return commit;
	}

	public void setCommit(Commit commit) {
		this.commit = commit;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
