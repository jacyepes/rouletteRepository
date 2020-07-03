package com.masivian.roulette.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "newRoulette")
public class NewRoulette {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="Roulette")
	private int idRoulette;

	public int getIdRoulette() {
		return idRoulette;
	}

	public void setIdRoulette(int idRoulette) {
		this.idRoulette = idRoulette;
	}

	public NewRoulette(int id, int idRoulette) {
		super();
		this.id = id;
		this.idRoulette = idRoulette;
	}

	public NewRoulette() {
	}


}
