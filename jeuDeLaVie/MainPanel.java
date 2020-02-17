import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

public class MainPanel extends JPanel implements ActionListener
{
	LifePanel lifepanel = null;
	int sizeGrid;
	public JButton start = null;
	public JButton stop = null;
	MainPanel(int sizeGrid)
	{
		this.sizeGrid = sizeGrid;
		start = new JButton("START"); 
        stop = new JButton("STOP");
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.lifepanel = new LifePanel(sizeGrid);
        this.add(lifepanel);
        this.add(start);
        this.add(stop);
        start.addActionListener(this);
        stop.addActionListener(this);
	}
	MainPanel()
	{
		this.sizeGrid = 100;
		start = new JButton("START"); 
        stop = new JButton("STOP");
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.add(new LifePanel(sizeGrid));
        this.add(start);
        this.add(stop);
        start.addActionListener(this);
        stop.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == start)
		{
			lifepanel.timer.start();
		}
		if(source == stop)
		{
			lifepanel.timer.stop();
		}
	}
}