package clases;

public class Agua extends Pokemon implements Atacable, Defensable{
	private final int vida;
	
	public Agua(String nom) {
		vida = Math.round(Math.round(250 + Math.random() * 400));
		setVida(vida);
		setDanyBase(15);
		setEnergia(100);
		setDefensa(10);
		setPrecisio(80);
	}
	public void resetStats() {
		setEnergia(100);
		setVida(vida);
	}
	public int getAtac() {
		int i = Math.round(Math.round(1 + Math.random() * 3));
		if (getDanyBase() < getEnergia()) {
			switch(i) {
			case 1:
				setSkill("Pistola Aigua");
				return getDanyBase() + Math.round(Math.round(30 + Math.random()) * 61) + 7;
			case 2:
				setSkill("Hidrobomba");
				return getDanyBase() + Math.round(Math.round(30 + Math.random()) * 61) + 13;
			case 3:
				setSkill("Raig Bombolla");
				return getDanyBase() + Math.round(Math.round(30 + Math.random()) * 61) + 5;
			default:
				return 0;
			}
		}
		else {
			return 0;
		}
	}
	public String getDefensa(Pokemon enemic, int atacEnemic) {
		int atac;
		String text = "";
		if ((Math.random() * 100) < getPrecisio()) {
			if (enemic.getClass() == Agua.class) {
				atac = atacEnemic - getDefensa();
				setVida(getVida() - atac);
				text = "La vida s'ha reduït en " + atac + " Punts la salut del pokemon " + getNom();
			}
			if (enemic.getClass() == Fuego.class) {
				atac = 3 * atacEnemic - getDefensa() * 2;
				setVida(getVida() - atac);
				text = "L'atac es poc efectiu. La vida s'ha reduït en " + atac + " Punts la salut del"
						+ " pokemon " + getNom();
			}
			if (enemic.getClass() == Electrico.class) {
				atac = 3 * atacEnemic - getDefensa() * 2;
				setVida(getVida() - atac);
				text =  "Atac crític. La vida s'ha reduït en " + atac + " Punts la salut del pokemon "
				+ getNom();
			}
		}
		else {
			return getNom() + " ha fallat l'atac";
		}
		if (enemic.getVida() <= 0) {
			return text + "\nEl pokemon " + enemic.getNom() + " s'ha debilitat";
		}
		if (enemic.getEnergia() == 0) {
			return text + "\nEl pokemon enemic no té energia";
		}
		return text;
	}
}
