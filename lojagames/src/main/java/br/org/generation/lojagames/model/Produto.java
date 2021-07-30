package br.org.generation.lojagames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String titulo;
	
	@NotNull
	private String descricao;
	
	@NotNull
	private String console;
	
	@NotNull(message = "O valor tipo não pode ser nulo!")
	private double valor;
	
	@ManyToOne	
	@JsonIgnoreProperties("tb_produtos")
	private Categoria tb_categoria;

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Categoria getTb_categoria() {
		return tb_categoria;
	}

	public void setTb_categoria(Categoria tb_categoria) {
		this.tb_categoria = tb_categoria;
	}
		
}
