package br.com.stadlab.projeto.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_tp_estabelecimento")
public class TipoEstabelecimento {
	
	
	public TipoEstabelecimento() {
		super();
	}

	public TipoEstabelecimento(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
		@Id
	@SequenceGenerator(name="tipoEstabelecimento", sequenceName="sq_tb_tp_estabelecimento",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_tp_estabelecimento")
	private Integer id;
	
	@Column(name="nm_tp_estabelecimento", length=30, nullable=false)
	private String nome;
	
	@OneToMany(mappedBy = "tipo")
	private Collection<Estabelecimento> estabelecimentos;
	
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
	
	public Collection<Estabelecimento> getEstabelecimentos() {
		return estabelecimentos;
	}

	public void setEstabelecimentos(Collection<Estabelecimento> estabelecimentos) {
		this.estabelecimentos = estabelecimentos;
	}

}
 