package br.com.hubfintech.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.Id;

@MappedSuperclass
public class BaseClass<T> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private Boolean isActive;
	@Column
	private String contaTipo;
	@Column
	private Integer matrisId;
	@Column
	Iterable<Integer> filialId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getContaTipo() {
		return contaTipo;
	}

	public void setContaTipo(String contaTipo) {
		this.contaTipo = contaTipo;
	}

	public Integer getMatrisId() {
		return matrisId;
	}

	public void setMatrisId(Integer matrisId) {
		this.matrisId = matrisId;
	}

	public Iterable<Integer> getFilialId() {
		return filialId;
	}

	public void setFilialId(Iterable<Integer> filialId) {
		this.filialId = filialId;
	}

}