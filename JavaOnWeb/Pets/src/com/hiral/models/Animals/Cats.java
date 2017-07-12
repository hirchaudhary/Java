package com.hiral.models.Animals;

public class Cats extends Animal{
	public Cats(String name, String breed, double weight) {
		this.setName(name);
		this.setBreed(breed);
		this.setWeight(weight);
	}
	public String showAffection() {
		return "Your " +this.getBreed()+ " cat, " +this.getName()+ " , looked at you with some affection. You think!";
	}
}
