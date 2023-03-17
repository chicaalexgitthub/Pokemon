package clases;
import java.util.ArrayList;


public class Usuario {
	private String alias;
	private ArrayList<Pokemon> pokemons;
	
	Usuario(String alias, ArrayList pokemons) {
		this.alias = alias;
		this.pokemons = pokemons;
	}
	
	public String getAlias() {
		return alias;
	}
	public ArrayList getPokemons() {
		return pokemons;
	}
}
