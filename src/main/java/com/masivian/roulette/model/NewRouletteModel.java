package com.masivian.roulette.model;

public class NewRouletteModel {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int idRoulette;

	public int getIdRoulette() {
		return idRoulette;
	}

	public void setIdRoulette(int idRoulette) {
		this.idRoulette = idRoulette;
	}

	public NewRouletteModel(int id, int idRoulette) {
		super();
		this.id = id;
		this.idRoulette = idRoulette;
	}

	public NewRouletteModel() {
	}

}
