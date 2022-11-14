public class LeaPassionGaragiste {

  public static void main(String[] args) {
    Renault maRenault1 = new Renault(200, 7000, "Bleue", 1999, 0.9);
    System.out.println(maRenault1.calculerPrixDeVente());
    
    Voiture maRenault2 = new Renault(200, 6000, "Bleue", 1999, 0.9);
    System.out.println(maRenault2.calculerPrixDeVente());
    
    Limousine maLimousine = new Limousine(200, 5500, "Bleue", 1999, 0.9, 10);
    System.out.println(maLimousine.calculerPrixDeVente());
  }
}