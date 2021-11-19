package src;

public class voiture extends Vehicule implements afficher {
	private String deplacement;
public voiture () {
	this.deplacement="";
}
public voiture (String deplacement) {
	this.deplacement=deplacement;
}
public String getdeplacement() {
	return deplacement;
	}
public void setdeplacementr(String deplacement) {
	this.deplacement=deplacement;
	}

}