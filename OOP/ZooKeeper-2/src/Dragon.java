
public class Dragon extends Mammal{
	public Dragon() {
		energyLevel = 300;
	}
	public void fly(){
		if(this.getEnergyLevel() >= 50){
			this.setEnergyLevel(this.getEnergyLevel() - 50);
			System.out.println("Dragon Fly");
		}else{
			System.out.println("No energy left. Can't fly");
		}
	}
	public void eatHuman(){
		System.out.println("well, never mind");
		this.setEnergyLevel(this.getEnergyLevel() + 25);
	}
	public void attackTown(){
		if(this.getEnergyLevel() >= 100){
			this.setEnergyLevel(this.getEnergyLevel() - 100);
			System.out.println("Attacked Town");
		}else{
			System.out.println("No enough energy left. Can't attack");
		}
	}
}
