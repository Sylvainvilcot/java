//VILCOT SYLVAIN GROUPE 4
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**
 * Le contrôleur chargé de répondre à un clic par une rotation du triangle.
 * @author Luc Hernandez
 */
public class SpinControl implements MouseListener {

  /**
   * Le triangle à tourner.
   */
  private Triangle model;

  /**
   * Crée un contrôleur .
   * @param m Le triangle à tourner.
   */
  public SpinControl(Triangle m) {
    this.model = m;
  }

  /**
   * Réagit à un clic de la souris en provoquant une rotation du triangle et un raffraîchissement de l'affichage.
   * @param e La représentation de l'événement.
   */
  public void mouseClicked(MouseEvent e) {
    
    if(e.getButton() == 1) {
      this.model.quarterTurn();
    }
    if(e.getButton() == 3) {
      this.model.switchColor();
    }
    e.getComponent().repaint();
    //System.out.println(e.getButton());
  }

  /**
   * Réagit à l'entrée du curseur dans la surface du composant (ne fait rien).
   * @param e La représentation de l'événement.
   */
  public void mouseEntered(MouseEvent e) {
  }

  /**
   * Réagit à la sortie du curseur de la surface du composant (ne fait rien).
   * @param e La représentation de l'événement.
   */
  public void mouseExited(MouseEvent e) {
  }

  /**
   * Réagit à l'appui  sur un bouton de la souris (ne fait rien).
   * @param e La représentation de l'événement.
   */
  public void mousePressed(MouseEvent e) {
  }

  /**
   * Réagit au relâchement d'un bouton de la souris (ne fait rien).
   * @param e La représentation de l'événement.
   */
  public void mouseReleased(MouseEvent e) {
  }

}