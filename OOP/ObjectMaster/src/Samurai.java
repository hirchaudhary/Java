
public class Samurai extends Human{
	public int numOfSamurai = 1;

	public Samurai(){
		this.setHealth(200);
		numOfSamurai++;
	}
	
	public void deathBlow(Human human) {
		human.setHealth(0);
		this.setHealth(this.getHealth() / 2);
		System.out.println("Samurai killed other human; it's health now: " + this.getHealth());
	}
	
	public void meditate() {
		this.setHealth(this.getHealth() + (this.getHealth() / 2));
		System.out.println("Samurai got meditate, increased his health by " + this.getHealth());
	}
	
	public int howMany() {
		System.out.println("Number of Samurai: " +numOfSamurai);
		return numOfSamurai;
	}
}