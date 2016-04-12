package test;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;

public class Applet extends JApplet{
	String prompt;
	public void init(){
	}
	public void paint(Graphics g){
		super.paint(g);
		Color Brown=new Color (102, 51, 0);
	
		g.setColor(Color.cyan);
		g.fillRect(0,0,400,200);	
		g.setColor(Color.green);	
		g.fillRect(0,190,400,10);
		g.setColor(Color.pink);	
		g.fillRect(150,110,100,80);
		
		g.setColor(Brown);	
		g.fillRect(220,60,20,50);
		g.setColor(Color.red);	
		g.fillPolygon(new int[] {120, 200, 280}, new int[] {110, 60, 110}, 3);
		g.setColor(Color.white);	
		g.fillRect(160,130,20,20);
		g.setColor(Color.white);	
		g.fillRect(220,130,20,20);
		g.setColor(Color.orange);	
		g.fillRect(190,140,20,50);
		g.setColor(Brown);	
		g.fillOval(205,165,5,5);
		
		g.setColor(Brown);	
		g.fillRect(60,150,20,40);
		
		g.setColor(Color.green);	
		g.fillOval(30,130,30,30);
		g.fillOval(40,120,30,30);
		g.fillOval(40,140,30,30);
		g.fillOval(50,130,30,30);
		g.fillOval(50,110,30,30);
		g.fillOval(50,120,30,30);
		g.fillOval(50,140,30,30);
		g.fillOval(60,120,30,30);
		g.fillOval(60,140,30,30);
		g.fillOval(70,130,30,30);
		g.setColor(Color.black);	
		g.fillOval(300,170,20,20);
		g.fillOval(360,170,20,20);
		g.setColor(Color.yellow);
		g.fillRoundRect(290,160,100,20,5,5);
		g.fillPolygon(new int[] {310, 320, 360, 370}, new int[] {160, 140, 140 ,160}, 4);
		
		g.fillOval(5,5,30,30);
		g.setColor(Brown);	
		g.drawOval(5,5,30,30);
		g.drawLine(45,20,65,20);
		g.drawLine(40,40,60,60);
		g.drawLine(20,45,20,65);
		g.setColor(Color.cyan);
		g.fillPolygon(new int[] {315, 321, 340, 340}, new int[] {160, 145, 145 ,160}, 4);
	}
}