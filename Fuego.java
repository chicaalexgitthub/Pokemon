package clases;

public class Fuego extends Pokemon implements Atacable, Defensable{
	private final int vida;
		
	public Fuego(String nom) {
		vida = Math.round(Math.round(250 + Math.random() * 400));
		setVida(vida);
		setDanyBase(20);
		setEnergia(100);
		setDefensa(15);
		setPrecisio(72);
	}
	public void resetStats() {
		setEnergia(100);
		setVida(vida);
	}
	public int getAtac() {
		int i = Math.round(Math.round(1 + Math.random() * 2));
		if (getDanyBase() < getEnergia()) {
			switch(i) {
			case 1:
				setSkill("Asques");
				return getDanyBase() + Math.round(Math.round(30 + Math.random()) * 61) + 12;
			case 2:
				setSkill("Llanzallames");
				return getDanyBase() + Math.round(Math.round(30 + Math.random()) * 61) + 4;
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
			if (enemic.getClass() == Electrico.class) {
				atac = atacEnemic - getDefensa();
				setVida(getVida() - atac);
				text = "La vida s'ha reduït en " + atac + " Punts la salut del pokemon " + getNom();
			}
			if (enemic.getClass() == Fuego.class) {
				atac = atacEnemic - getDefensa() * 2;
				setVida(getVida() - atac);
				text = "L'atac es poc efectiu. La vida s'ha reduït en " + atac + " Punts la salut del"
						+ " pokemon " + getNom();
			}
			if (enemic.getClass() == Agua.class) {
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
