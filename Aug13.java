package swing;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Aug13 
{
	
public static void main(String args[])
{
	JFrame f=new JFrame("Button Example");            
	JButton b=new JButton(new ImageIcon("/home/hp-pc/Pictures/index.jpeg"));    
	b.setBounds(100,100,100,140);  
	f.add(b);
	f.setSize(300,400);    
	f.setLayout(null);    
	f.setVisible(true);    
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	    }         
}
