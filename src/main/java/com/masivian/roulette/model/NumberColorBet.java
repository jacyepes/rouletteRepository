package com.masivian.roulette.model;

public class NumberColorBet {

	public String numberBet;
	public String colorBet;

	public String getNumberBet() {
		return numberBet;
	}

	public void setNumberBet(String numberBet) {
		this.numberBet = numberBet;
	}

	public String getColorBet() {
		return colorBet;
	}

	public void setColorBet(String colorBet) {
		this.colorBet = colorBet;
	}

	public NumberColorBet(String numberBet, String colorBet) {
		super();
		this.numberBet = numberBet;
		this.colorBet = colorBet;
	}

	public NumberColorBet() {
	}

	@Override
	public String toString() {
		return "NumberColorBet [numberBet=" + numberBet + ", colorBet=" + colorBet + "]";
	}
	
	

}
