package com.hiral.models.Animals;

public class Dogs extends Animal{
	public Dogs(String name, String breed, double weight) {
		this.setName(name);
		this.setBreed(breed);
		this.setWeight(weight);
	}

	public String showAffection(){
		if(this.getWeight() < 30){
			return this.getName() +" hopped into your lap and cuddled you";
		}else{
			return this.getName() + " curl up next to you";
		}
	}
}
