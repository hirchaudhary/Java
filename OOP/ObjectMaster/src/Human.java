
public class Human {
	private int strength;
	private int intelligence;
	private int stealth;
	private int health;
	public Human() {
		strength = 3;
		intelligence = 3;
		stealth = 3;
		health = 100;
	}
	

	public int getStrength() { return strength; }

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() { return intelligence; }

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}


	public int getStealth() { return stealth; }

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getHealth() { return health; }

	public void setHealth(int health) {
		this.health = health;
	}

	public void attack(Human human) {
		human.setHealth(human.getHealth() - this.getStrength());
		System.out.println(human+ " got Attacked, health is now " +human.getHealth() );
	}
}
