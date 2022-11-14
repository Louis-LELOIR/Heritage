public class Limousine extends Voiture {
  private int anneeFabrication;
  private double reducConstructeur;
  private int longueur; 
  
  public Limousine(int vitesseMax, double prixDeVenteBase, String couleur, int anneeFabrication, double reducConstructeur, int longueur){
    super(vitesseMax, prixDeVenteBase, couleur);
    this.anneeFabrication = anneeFabrication;
    this.reducConstructeur = reducConstructeur;
    this.longueur = longueur;
  }

  @Override
  public double calculerPrixDeVente(){
    double prixBase = super.getPrixDeVenteBase();
    double prixVente = ((this.longueur > 6) ? 0.95 : 0.9) * prixBase;
    return prixVente;
  }
}