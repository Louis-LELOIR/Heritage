public class Point {
  private int x, y ;
  
  public Point (int x, int y) {
    this.x = x ;
    this.y = y ;
  }
  
  public void deplacee(int dx, int dy) {
    x += dx ;
    y += dy ;
  }
  
  public int getX() {
    return x ;
  }
  
  public int getY() {
    return y ;
  }

  public void setY(int y) {
    this.y = y;
  }
  public void setX(int x) {
    this.x = x;
  }
  /*
  public void setPoint (int x, int y) {
    this.x = x ;
    this.y = y ;
  }
  */
  
  public void deplace (int dx, int dy) {
    x += dx ;
    y += dy ;
  }
  
  public void afficheCoords () {
    System.out.println ("Coordonnées : " + x + " " + y) ;
  }
}