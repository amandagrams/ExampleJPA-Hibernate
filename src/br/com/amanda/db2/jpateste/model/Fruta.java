package br.com.amanda.db2.jpateste.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Fruta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "frutaSeq")
	@SequenceGenerator(name = "frutaSeq", sequenceName = "s_Fruta", allocationSize = 1)
	private Long id;

	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(precision = 12, scale = 2, nullable = false)
	private BigDecimal preco;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "fruteira", foreignKey =  @ForeignKey(name = "fk_fruta_fruteira"))
	private Fruteira fruteira;

	@ManyToOne(optional = false)
	@JoinColumn(name = "classificacao", 
			    foreignKey =  @ForeignKey(name = "fk_fruta_classificacao"))
	private Classificacao classificacao; 

	@Column(nullable = false)
	private LocalDate dtCadastro;
}
