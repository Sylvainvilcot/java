import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

public class LifePanel extends JPanel implements ActionListener
{
	int sizeGrid;
	Timer timer;
	boolean[][] grid = null;
	LifePanel(int sizeGrid)
	{
		this.sizeGrid = sizeGrid;
		int size = 1000;
		grid = new boolean[sizeGrid][sizeGrid];
		randInit();
		int delay = 200;
		this.timer = new Timer(delay, this);
		//timer.start();
	}
	LifePanel()
	{
		this.sizeGrid = 100;
		int size = 1000;
		grid = new boolean[sizeGrid][sizeGrid];
		randInit();
		int delay = 200;
		this.timer = new Timer(delay, this);
		//timer.start();
	}
	@Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
		int x = 0;
		int y = 0;
		int max = 0;
		for ( int i = 0 ; i < sizeGrid ; i++)
        {
          max = max + 1000/sizeGrid;
        }
		for( int i = 0 ; i < sizeGrid ; i++)
		{
			for( int j = 0 ; j < sizeGrid ; j++)
			{
				g.setColor(Color.BLACK);
				g.drawLine(0,y,max,y);
				g.drawLine(x,0,x,max);
				x = x + max/sizeGrid;
				if(this.grid[i][j])
				{
					g.fillRect(i * max/sizeGrid,j * max/sizeGrid, max/sizeGrid, max/sizeGrid);
				}
			}
			y = y + max/sizeGrid;
			x = 0;
		}
	}

	public void randInit()
	{
		for( int i = 0 ; i < sizeGrid ; i++)
		{
			for( int j = 0 ; j < sizeGrid ; j++)
			{
				grid[i][j] = Math.random() * ( 2 - 0 ) > 1;
			}
		}
	}

    public void actionPerformed(ActionEvent evt)
	{
		cycle();
	}

	public void cycle()
	{
		boolean [][] gridTemp = new boolean[sizeGrid][sizeGrid];
		for( int i = 0 ; i < sizeGrid ; i++)
		{
			for(int j = 0 ; j < sizeGrid ; j++)
			{
				if(grid[i][j])
				{
					if(calculVoisin(i,j) == 3 || calculVoisin(i,j) == 2)
					{
						gridTemp[i][j] = true;
					}
					else
					{
						gridTemp[i][j] = false;
					}
				}
				else
				{
					if(calculVoisin(i,j) == 3)
					{
						gridTemp[i][j] = true;
					}
					else
					{
						gridTemp[i][j] = false;
					}
				}
			}
		}
		for( int i = 0 ; i < sizeGrid ; i++)
		{
			for(int j = 0 ; j < sizeGrid ; j++)
			{
				grid[i][j] = gridTemp[i][j];
			}
		}
		repaint();
	}

	public int calculVoisin(int i,int j)
	{
		int voisin = 0;
		if(i == 0 && j ==0)
		{
			if(grid[i+1][j]){voisin++;}
			if(grid[i+1][j+1]){voisin++;}
			if(grid[i][j+1]){voisin++;}
		}
		else if (i==0 && j == sizeGrid-1)
		{
			if(grid[i+1][j]){voisin++;}
			if(grid[i+1][j-1]){voisin++;}
			if(grid[i][j-1]){voisin++;}
		}
		else if (i==0)
		{
			if(grid[i+1][j]){voisin++;}
			if(grid[i+1][j+1]){voisin++;}
			if(grid[i][j+1]){voisin++;}
			if(grid[i+1][j-1]){voisin++;}
			if(grid[i][j-1]){voisin++;}
		}
		else if (j == 0 && i == sizeGrid-1)
		{
			if(grid[i][j+1]){voisin++;}
			if(grid[i-1][j+1]){voisin++;}
			if(grid[i-1][j]){voisin++;}
		}
		else if (j==0)
		{
			if(grid[i][j+1]){voisin++;}
			if(grid[i+1][j+1]){voisin++;}
			if(grid[i-1][j+1]){voisin++;}
			if(grid[i+1][j]){voisin++;}
			if(grid[i-1][j]){voisin++;}
		}
		
		if(i == sizeGrid-1 && j == sizeGrid-1)
		{
			if(grid[i-1][j]){voisin++;}
			if(grid[i][j-1]){voisin++;}
			if(grid[i-1][j-1]){voisin++;}
		}
		else if(i == sizeGrid-1 && j == 0)
		{
			if(grid[i-1][j]){voisin++;}
			if(grid[i-1][j+1]){voisin++;}
			if(grid[i][j+1]){voisin++;}
		}
		else if(i == sizeGrid-1)
		{
			if(grid[i-1][j]){voisin++;}
			if(grid[i-1][j+1]){voisin++;}
			if(grid[i][j+1]){voisin++;}
			if(grid[i-1][j-1]){voisin++;}
			if(grid[i][j-1]){voisin++;}
		}
		else if (j == sizeGrid-1 && i == 0)
		{
			if(grid[i][j-1]){voisin++;}
			if(grid[i+1][j-1]){voisin++;}
			if(grid[i+1][j]){voisin++;}
		}
		else if (j == sizeGrid-1)
		{
			if(grid[i][j-1]){voisin++;}
			if(grid[i+1][j-1]){voisin++;}
			if(grid[i-1][j-1]){voisin++;}
			if(grid[i+1][j]){voisin++;}
			if(grid[i-1][j]){voisin++;}
		}
		if(i > 0 && j > 0 && i < sizeGrid-1 && j < sizeGrid-1)
		{
			if(grid[i][j+1]){voisin++;}
			if(grid[i][j-1]){voisin++;}
			if(grid[i+1][j+1]){voisin++;}
			if(grid[i-1][j+1]){voisin++;}
			if(grid[i+1][j]){voisin++;}
			if(grid[i-1][j]){voisin++;}
			if(grid[i+1][j-1]){voisin++;}
			if(grid[i-1][j-1]){voisin++;}
		}
		return voisin;
	}
}