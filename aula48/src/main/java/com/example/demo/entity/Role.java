package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Enumerated(EnumType.STRING)
	private StatusRole status;

	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<Functionality> funcionalities;

	public Role() {
		super();
	}

	public Role(String name, StatusRole status, List<Functionality> funcionalities) {
		super();
		this.name = name;
		this.status = status;
		this.funcionalities = funcionalities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Functionality> getFuncionalities() {
		return funcionalities;
	}

	public void setFuncionalities(List<Functionality> funcionalities) {
		this.funcionalities = funcionalities;
	}

	public StatusRole getStatus() {
		return status;
	}

	public void setStatus(StatusRole status) {
		this.status = status;
	}

}
