package clases;
import java.util.Arrays;

public abstract class Pokemon {
	private String nom;
	private int energia;
	private int vida;
	private int danyBase;
	private int defensa;
	private int precisio;
	private String skill;
	
	public abstract void resetStats();
	public String toString() {
		return 	"******************************\n" + 
				nom + "\n" + 
				"******************************\n" +
				"Energia: " + energia + "\n" +
				"Vida: " + vida + "\n" + 
				"Dany Base: " + danyBase + "\n" +
				"Defensa: " + defensa + "\n" +
				"Precisio: " + precisio + "\n" +
				"******************************";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getDanyBase() {
		return danyBase;
	}
	public void setDanyBase(int danyBase) {
		this.danyBase = danyBase;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getPrecisio() {
		return precisio;
	}
	public void setPrecisio(int precisio) {
		this.precisio = precisio;
	}
}
