
public class MainPokemon {

	public static void main(String[] args) {
        Pokedex pd = new Pokedex();
        Pokemon squirtle = pd.createPokemon("squirtle",65,"water");
        Pokemon balbasuar = pd.createPokemon("balbasaur",70,"fire");
        pd.attackPokemon(balbasuar);
        pd.pokemonInfo(balbasuar);
        pd.attackPokemon(squirtle);
        pd.pokemonInfo(squirtle);
        System.out.println("\nNumber of Pokemon created so far: "+Pokemon.getCount()); 
	}

}
