
public class Wizard extends Human{

	public Wizard(){
		this.setHealth(50);
		this.setIntelligence(8);
	}
	
	public void heal(Human human) {
		human.setHealth(human.getHealth() + this.getIntelligence());
		System.out.println("Wizard cast healing spell; human health: " + human.getHealth());
	}
	
	public void fireball(Human human) {
		human.setHealth(human.getHealth() - this.getIntelligence() * 3);
		System.out.println("Wizard cast fireball; human health: " + human.getHealth());
	}
}
