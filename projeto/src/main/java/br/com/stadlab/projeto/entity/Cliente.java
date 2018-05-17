package br.com.stadlab.projeto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente {
	
	public Cliente(Integer id, String nome, String cpf, String email, String celular) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.celular = celular;
	}

	public Cliente() {
		super();
	}

	@Id
	@SequenceGenerator(name="Cliente", sequenceName="sq_tb_cliente",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Cliente")
	@Column(name="id_cliente")
	private Integer id;
	
	@Column(name="ds_nome", length=50, nullable=false)
	private String nome;
	
	@Column(name="nr_cpf", length=25, nullable=false)
	private String cpf;

	@Column(name="ds_email", length=50, nullable=false)
	private String email;
	
	@Column(name="nr_celular")
	private String celular;
	
	@OneToOne(mappedBy="cliente")
	private Usuario usuario;
	
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
 