package br.com.stadlab.projeto.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="tb_medicao")
public class Medicao {
	
	@Id
	@SequenceGenerator(name="Medicao", sequenceName="sq_tb_medicao",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Medicao")
	@Column(name="id_medicao")
	private Integer id;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_medicao")
	private Calendar dataCriacao;
	
	@JoinColumn(name="id_equipamento")
	@ManyToOne
	private Equipamento equipamento;
	
}
