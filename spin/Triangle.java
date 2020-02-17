//VILCOT SYLVAIN GROUPE 4

import java.awt.*;

/**
 * Le modèle du triangle.
 * @author Luc Hernandez
 */
public class Triangle extends Polygon {

  /**
   * Crée un triangle centré sur l'origine et pointant vers la droite.
   */
  String couleur;
  
  public Triangle() {
    this.addPoint(-25, 25);
    this.addPoint(-25, -25);
    this.addPoint(50, 0);

    this.couleur = "orange";
    //System.out.println(couleur);

  }

  /**
   * Applique une rotation d'un quart de tour dans le sens des aiguilles d'une montre.
   */
  public void quarterTurn() {
    for(int i=0; i < this.npoints; i++) {
      int tmp = this.xpoints[i];
      this.xpoints[i] = -this.ypoints[i];
      this.ypoints[i] = tmp;
    }
  }

  public void switchColor() {
    if(couleur.equals("orange")) {
      couleur = "rouge";
    }
    else if(couleur.equals("rouge")) {
      couleur = "vert";
    }
    else if(couleur.equals("vert")) {
      couleur = "orange";
    }
    //System.out.println(couleur);
  }

}