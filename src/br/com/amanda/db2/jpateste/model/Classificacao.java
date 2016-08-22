package br.com.amanda.db2.jpateste.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Classificacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "classificacaoSeq")
	@SequenceGenerator(name = "classificacaoSeq", sequenceName = "s_Classificacao", allocationSize = 1)
	private Long id;

	@Column(length = 50, nullable = false)
	private String nome;
}
