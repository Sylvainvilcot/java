//VILCOT SYLVAIN GROUPE 4
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;

/**
 * Le composant graphique responsable de l'affichage du triangle.
 * @author Luc Hernandez
 */
public class SpinComponent extends JComponent {

  /**
   * Le triangle à afficher.
   */
  private Triangle model;

  /**
   * Crée le composant, y compris  son modèle et son contrôleur internes.
   */
  public SpinComponent() {
    this.model = new Triangle();
    this.addMouseListener(new SpinControl(this.model));
  }

  /**
   * Dessine le contenu du composant (un triangle).
   * @param g Le pinceau utilisé pour le dessin.
   */
  protected void paintComponent(Graphics g) {
    Graphics g2 = g.create();
    if (this.isOpaque()) {
      g2.setColor(this.getBackground());
      g2.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
    g2.translate(this.getWidth()/2, this.getHeight()/2);

    if(model.couleur.equals("orange")){
      g2.setColor(Color.ORANGE);      
    }
    if(model.couleur.equals("rouge")){
      g2.setColor(Color.RED);      
    }
    if(model.couleur.equals("vert")){
      g2.setColor(Color.GREEN);      
    }

    g2.fillPolygon(this.model);
    g2.setColor(Color.BLACK);
    g2.drawPolygon(this.model);
  }

}