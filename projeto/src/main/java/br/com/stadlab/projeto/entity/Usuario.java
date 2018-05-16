package br.com.stadlab.projeto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_usuario")
public class Usuario {
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(Integer id, String usuario, String senha) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.senha = senha;
	}

	@Id
	@SequenceGenerator(name="Usuario", sequenceName="sq_tb_usuario",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private Integer id;
	
	@Column(name="ds_usuario", length=50, nullable=false)
	private String usuario;
	
	@Column(name="ds_senha", length=50, nullable=false)
	private String senha;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}