//VILCOT SYLVAIN GROUPE 4
import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 * La fenêtre de l'application.
 * @author Luc Hernandez
 */
public class SpinFrame extends JFrame {

  /**
   * Crée une fenêtre sans la rendre visible.
   */
  public SpinFrame() {
    super("Spin");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(200, 200);
    this.setLocation(200,200);
    this.add(new SpinComponent(), BorderLayout.CENTER);
  }

}