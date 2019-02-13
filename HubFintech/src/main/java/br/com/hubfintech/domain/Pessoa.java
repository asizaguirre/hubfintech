package br.com.hubfintech.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.apache.activemq.store.memory.MemoryTransactionStore.Tx;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table
@DiscriminatorValue("childClasss")
public class Pessoa extends BaseClass<Tx> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty()
	private Integer id;
	@ApiModelProperty(notes = "CPF ou CNPJ")
	private String docs;
	@ApiModelProperty(notes = "Razao social")
	private String razãoSocial;

	/**
	 * @param id
	 * @param docs
	 * @param razãoSocial
	 * @param nomeFantasia
	 * @param dataNascimento
	 * @param conta
	 */
	public Pessoa(Integer id, String docs, String razãoSocial, String nomeFantasia, Date dataNascimento, Conta conta) {
		this.id = id;
		this.docs = docs;
		this.razãoSocial = razãoSocial;
		this.nomeFantasia = nomeFantasia;
		this.dataNascimento = dataNascimento;
		this.conta = conta;
	}

	@ApiModelProperty(notes = "Nome Fantasia ou nome")
	private String nomeFantasia;
	@ApiModelProperty(notes = "Data de nascimento")
	private Date dataNascimento;

	@OneToOne(cascade = { CascadeType.ALL })
	@PrimaryKeyJoinColumn
	private Conta conta;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDocs() {
		return docs;
	}

	public void setDocs(String docs) {
		this.docs = docs;
	}

	public String getRazãoSocial() {
		return razãoSocial;
	}

	public void setRazãoSocial(String razãoSocial) {
		this.razãoSocial = razãoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
