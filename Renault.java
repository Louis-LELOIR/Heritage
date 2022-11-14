public class Renault extends Voiture {

  private int anneeFabrication;
  private double reducConstructeur;
  
  public Renault(int vitesseMax, double prixDeVenteBase, String couleur, int anneeFabrication, double reducConstructeur){
    super(vitesseMax, prixDeVenteBase, couleur);
    this.anneeFabrication = anneeFabrication;
    this.reducConstructeur = reducConstructeur;
  }

  @Override
  public double calculerPrixDeVente(){
    double prixBase = super.getPrixDeVenteBase();
    double prixVente = prixBase * this.reducConstructeur;
    return prixVente;
  }
  
}