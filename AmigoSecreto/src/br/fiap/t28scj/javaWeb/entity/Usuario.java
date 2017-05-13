package br.fiap.t28scj.javaWeb.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	@Column(name="ID")
	private Integer Id;
	
	@Column(name="USUARIO")
	private String nome;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="SENHA")
	private String senha;
	
	@Column(name="PERFIL")
	@Enumerated(EnumType.STRING)
	private Perfil perfil;
	
	@ManyToOne(targetEntity=Grupo.class)
	private List<Grupo> grupos;

	@Deprecated
	public Usuario() {}
	
	public Usuario(String email, String senha, Perfil perfil){
		setEmail(email);
		setSenha(senha);
		setPerfil(perfil);
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}	
}
