class Main {
  public static void main(String[] args) {
    /*
    PointA pointA = new PointA(5, 15);
    pointA.afficheCoords();
    System.out.println(pointA.getX());
    System.out.println(pointA.getY());

    PointNom pointNom = new PointNom(6, 12, "Balthazar");
    pointNom.afficheCoords();
    pointNom.setPointNom(15, 25, "Morice");
    pointNom.afficheCoords();
    pointNom.getNom();
    pointNom.setNom("Ronald Weasley");
    pointNom.getNom();
    */
    /*
    Camion monCamion = new Camion(200, 15000, "Rouge", 1500);
    System.out.println(monCamion.calculerPrixDeVente());
    */
    
    Renault maRenault1 = new Renault(200, 7000, "Bleue", 1999, 0.9);
    System.out.println(maRenault1.calculerPrixDeVente());
    Voiture maRenault2 = new Renault(200, 6000, "Bleue", 1999, 0.9);
    System.out.println(maRenault2.calculerPrixDeVente());
    
    Limousine maLimousine = new Limousine(200, 5500, "Bleue", 1999, 0.9, 10);
    System.out.println(maLimousine.calculerPrixDeVente());
    
    
  }
}