import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Cadre extends JFrame
{
	JLabel image1;
	JLabel image2;
	JLabel image3;
	JLabel [] images;
	JPanel panneau;
	Listener listener;
	int i;
	CardLayout layout;
	public Cadre()
	{
		this.setTitle("Exercice1");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		this.listener = new Listener(this);
		this.addMouseListener(listener);
		this.images = new JLabel[3];


		this.layout = new CardLayout();

		this.panneau = new JPanel(this.layout);
		this.panneau.setLayout(layout);

		this.images[0] = new JLabel(new ImageIcon("image1.gif"));
		this.images[1] = new JLabel(new ImageIcon("image2.gif"));
		this.images[2] = new JLabel(new ImageIcon("image3.gif"));

		this.panneau.add(images[0],"Image 1");
		this.panneau.add(images[1],"Image 2");
		this.panneau.add(images[2],"Image 3");


		this.add(panneau);
	}

	
}