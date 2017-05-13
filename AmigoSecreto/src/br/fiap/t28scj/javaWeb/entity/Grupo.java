package br.fiap.t28scj.javaWeb.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="grupo")
public class Grupo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	@Column(name="ID")
	private Integer id;
	
	@Column(name="DESCRICAO")
	private String descricao;

	@Column(name="DT_EVENTO")
	@Temporal(TemporalType.DATE)
	private Date dtEvento;
	
	@ManyToOne()
	private Usuario dono;
	
	@ManyToMany
	private List<Usuario> usuarios;
	
	@OneToMany(mappedBy="grupo")
	private List<Sorteio> sorteios;

	@Deprecated
	public Grupo() {
		super();
	}

	public Grupo(Integer id, String descricao, Date dtEvento) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.dtEvento = dtEvento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDtEvento() {
		return dtEvento;
	}

	public void setDtEvento(Date dtEvento) {
		this.dtEvento = dtEvento;
	}

	public Usuario getDono() {
		return dono;
	}

	public void setDono(Usuario dono) {
		this.dono = dono;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Sorteio> getSorteios() {
		return sorteios;
	}

	public void setSorteios(List<Sorteio> sorteios) {
		this.sorteios = sorteios;
	}
}
