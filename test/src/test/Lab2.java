package test;

import java.util.Scanner;
import java.awt.*;	
import javax.swing.*;

public class Lab2 extends JPanel{
	int size_l,size_g;
	int flag;
	public Lab2(int f){
		int tmp =(int)(Math.random()*150);
		size_l = tmp;
		tmp =(int)(Math.random()*150);
		if(tmp>size_l){
			size_g = tmp;
		}
		else{
			size_g=size_l;
			size_l=tmp;
		}
		flag=f;
		setSize(500,600);
		setVisible(true); 
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int w=(getWidth()-size_g)/2;
		int h=(getHeight()-size_g)/2;
		Point p=new Point(w,h);
		
		JFrame frame = (JFrame)SwingUtilities.getRoot(this);
		int fw=(frame.getWidth()-size_l)/2;
		int fh=(frame.getHeight()-size_l)/2;
		//convert frame cord to panel cord
		Point fp=SwingUtilities.convertPoint(frame, fw, fh, this);
		
		int r_l=(int)(Math.random()*256);
		int g_l=(int)(Math.random()*256);
		int b_l=(int)(Math.random()*256);
		int r_g=(int)(Math.random()*256);
		int g_g=(int)(Math.random()*256);
		int b_g=(int)(Math.random()*256);
		
		Color color_g = new Color(r_g, g_g, b_g);
		Color color_l = new Color(r_l, g_l, b_l);
		
		if(flag==0){
			g.setColor(color_g);	
			g.fillRect(p.x,p.y,size_g,size_g);
			
			g.setColor(color_l);	
			g.fillRect(fp.x,fp.y,size_l,size_l);
		}
		else{
			g.setColor(color_g);
			g.fillOval(p.x,p.y,size_g,size_g);
			
			g.setColor(color_l);	
			g.fillOval(fp.x,fp.y,size_l,size_l);
		}
	}      
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int choice;
		choice=input.nextInt();
		
		Lab2 p  = new Lab2(choice);
		JFrame w = new JFrame();

	    w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );	 
	    w.add(p);
	    w.setSize(500,600);
	    w.setVisible(true);	
	}
}