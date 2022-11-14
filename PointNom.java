public class PointNom extends Point {
  
  private String nom;
  
  public PointNom(int x, int y, String nom) {
    super(x, y);
    this.nom = nom;
  }

  public void setPointNom(int x, int y, String newNom) {
    //System.out.println(this.nom);
    this.setX(x);
    this.setY(y);
    this.nom = newNom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void getNom(){
    System.out.println(this.nom);
  }
}