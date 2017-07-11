
public class MainHuman {
	public static void main(String[] args) {
		Wizard w = new Wizard();
		Ninja n = new Ninja();
		Samurai s = new Samurai();
		Samurai second = new Samurai();
		s.attack(w);
		w.heal(n);
		w.fireball(second);
		n.steal(second);
		n.runAway();
		s.deathBlow(w);
		s.meditate();
		s.howMany();
	}
}
