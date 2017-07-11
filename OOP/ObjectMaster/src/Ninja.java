
public class Ninja extends Human{
	public Ninja(){
		this.setStealth(10);
	}
	
	public void steal(Human human) {
		human.setHealth(human.getHealth() - this.getStealth());
		this.setHealth(human.getHealth() + human.getHealth());
		System.out.println("Ninja stole health from enemy; human health now: " + human.getHealth());
		System.out.println("Ninja stole health from enemy; ninja health now: " + this.getHealth());
	}
	
	public void runAway() {
		this.setHealth(this.getHealth() - 10);
		System.out.println("Ninja ran away; Ninja's health now: " + this.getHealth());
	}
}