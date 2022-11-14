public class Voiture {
  private int vitesseMax;
  private double prixDeVenteBase;
  private String couleur;

  public Voiture(int vitesseMax, double prixDeVenteBase, String couleur){
    this.vitesseMax = vitesseMax;
    this.prixDeVenteBase = prixDeVenteBase;
    this.couleur = couleur;
  }

  public double calculerPrixDeVente(){
    return this.prixDeVenteBase;
  }
  
  public double getPrixDeVenteBase() {
    return this.prixDeVenteBase;
  }
}