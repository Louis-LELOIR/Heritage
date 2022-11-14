public class Camion extends Voiture {
  private double poids;

  public Camion(int vitesseMax, double prixDeVenteBase, String couleur, double poids) {
    super(vitesseMax, prixDeVenteBase, couleur);
    this.poids = poids;
  }

  @Override
  public double calculerPrixDeVente(){
    double prixBase = super.getPrixDeVenteBase();
    double prixVente = ((this.poids > 2000) ? 0.9 : 0.8) * prixBase;
      return prixVente;
  }
}