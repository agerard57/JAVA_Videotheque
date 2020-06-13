package Models.Produits;

public final class BD extends Livre {

	private final int volume;
	private final String illustrateur;

	public BD(String titre, double tarif_journa, String auteur, int volume, String illustrateur) {
		super(titre, tarif_journa, auteur);

		this.volume = volume;
		this.illustrateur = illustrateur;
	}

	@Override
	public Produit copy() {
		return new BD(titre, tarifJourna, auteur, volume, illustrateur);
	}

	@Override
	public String getType() {
		return "BD";
	}

	@Override
	public int hashCode() {
		return produitHashCode() + volume + this.illustrateur.hashCode();
	}

	@Override
	public String toString() {
		return String.format("%s - %s n° %s ", auteur, titre, volume);
	}

	public int getVolume() {
		return volume;
	}

	public String getIllustrateur(){
		return illustrateur;
	}

}