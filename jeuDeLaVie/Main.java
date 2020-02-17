import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

class Main
  {
    public static void main(String[] args)
    {
      int sizeGrid = 30;
      JFrame.setDefaultLookAndFeelDecorated(true);
      JFrame f = new JFrame();
      f.setSize(1150, 1000);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.add(new MainPanel(sizeGrid));
      //f.add(new MainPanel());
      f.setVisible(true);

    }
  }