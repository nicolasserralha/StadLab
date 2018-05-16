package br.com.stadlab.projeto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_estabelecimento")
public class Estabelecimento {
	
	@Id
	@SequenceGenerator(name="Estabelecimento", sequenceName="sq_tb_estabelecimento",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_estabelecimento")
	private Integer id;
	
	@Column(name="nm_estabelecimento", length=30, nullable=false)
	private String nome;

	@JoinColumn(name = "id_tp_estabelecimento")
	@ManyToOne
	private TipoEstabelecimento tipo;
	
	public Estabelecimento() {
		super();
	}

	public Estabelecimento(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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
	
	public TipoEstabelecimento getTipo() {
		return tipo;
	}

	public void setTipo(TipoEstabelecimento tipo) {
		this.tipo = tipo;
	}

}
 