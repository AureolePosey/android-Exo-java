package src;

public class Vehicule implements afficher{
	 private String couleur;
	private double vitesse;
	private double poids;
	
	public Vehicule() {
		this.couleur="";
		this.poids=0.0;
		this.vitesse=0.0;
	
	}

	public Vehicule(String couleur,double vitesse,double poids) {
		this.couleur=couleur;
		this.poids=poids;
		this.vitesse=vitesse;
	
	}
	public String getcouleur() {
		return couleur;
		}
	
	public double getvitesse() {
		return vitesse;	
		}
	
	public double getpoids() {
		return poids;
	}
	
	public void setcouleur(String couleur) {
		this.couleur=couleur;
		}
	public void setvitesse(double vitesse) {
		this.vitesse=vitesse;
		}
	public void setpoids(double poids) {
		this.poids=poids;
		}
public void moyendedeplacement(String mdd) {
	System.out.println("il se deplace en faisant la:" +mdd);
}
}
 