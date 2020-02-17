import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Listener implements MouseListener
{
	Cadre c;
	int compteur;
	String chaine;
	int posX;
	int width;
	public Listener(Cadre c)
	{
		this.c = c;
		this.compteur = 0;
	}

	public void mouseClicked(MouseEvent e)
	{
		this.posX = e.getX();
		this.width = c.getWidth();
		if(this.posX > this.width/2)
		{
			this.c.layout.next(this.c.panneau);
		}
		else
		{
			this.c.layout.previous(this.c.panneau);	
		}
	}
	public void mouseEntered(MouseEvent e)
	{

	}
	
	public void mouseExited(MouseEvent e)
	{
		
	}

	public void mousePressed(MouseEvent e)
	{
	}

	public void mouseReleased(MouseEvent e)
	{
	}
}