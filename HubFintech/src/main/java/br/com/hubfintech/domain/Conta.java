package br.com.hubfintech.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.activemq.store.memory.MemoryTransactionStore.Tx;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table
public class Conta extends BaseClass<Tx> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty()
	private Integer id;

	@ApiModelProperty(notes = "Nome da conta")
	private String nome;

	@ApiModelProperty(notes = "Data de criação")
	private Date dateCriacao;

	@OneToOne(mappedBy = "conta", cascade = CascadeType.ALL, orphanRemoval = true)
	private Pessoa pessoa;

	public Conta() {
		super();
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

	public Date getDateCriacao() {
		return dateCriacao;
	}

	public void setDateCriacao(Date dateCriacao) {
		this.dateCriacao = dateCriacao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
