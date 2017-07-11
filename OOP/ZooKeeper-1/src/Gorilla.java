
public class Gorilla extends Mammal{
	public void throwThing(){
		if(this.getEnergyLevel() > 5){
			this.setEnergyLevel(this.getEnergyLevel() - 5);
			System.out.println("Gorilla threw something");
		}else{
			System.out.println("No energy left. Can't throw things");
		}
	}
	public void eatBanana(){
		System.out.println("Gorilla eat Banana");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}
	public void climb(){
		if(this.getEnergyLevel() > 10){
			this.setEnergyLevel(this.getEnergyLevel() - 10);
			System.out.println("Gorilla climbed");
		}else{
			System.out.println("No enough energy left. Can't climb");
		}
	}
}
