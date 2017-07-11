
public class Mammal {
	protected int energyLevel;
	
	public Mammal() {
		energyLevel = 100;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public int displayEnergy(){
		System.out.println("Energy level is: " +energyLevel);
		return energyLevel;
	}
}
