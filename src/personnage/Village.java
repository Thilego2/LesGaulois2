package personnage;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	private Gaulois[] villageois;
	
	public Village(String nom,int nbVillageoisMax) {
		villageois = new Gaulois[nbVillageoisMax];
		this.nom = nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois]=gaulois;
			nbVillageois += 1;
		}
	}
	
	public Gaulois trouverHabitant(int numVilleageois) {
//		if (numVilleageois < villageois.length) {
			return villageois[numVilleageois-1];
//		}
	}
	
	public void afficherVillageois(Village village) {
		//TODO
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
//		Gaulois gaulois = village.trouverHabitant(30);
		Chef abraracourcix = new Chef("Abraracoucix",6,village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix",8);
		village.ajouterHabitant(asterix);
		Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois);
	}

}
