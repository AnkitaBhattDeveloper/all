package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
//import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class add extends JFrame implements ActionListener {
	 
	
	
 JTextField t1,t2;
 JButton jb;
 JLabel jl;
 
	public add()
	{
		 setSize(700,600);
		 setLayout(null);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	 t1 = new JTextField();
	t1.setBounds(10, 50, 80, 80);
	 
	 t2 = new JTextField();
	t2.setBounds(10, 100, 80, 40);
	 jb = new JButton("click");
	jb.setBounds(250,50, 100, 50);
	jb.addActionListener(this);
	  jl = new JLabel("result");
	  jl.setBounds(25,150, 100, 50);
	 add(t1);
	 add(t2);
	 add(jb);
	 add(jl);
	
	  JButton img = new JButton(new ImageIcon("/home/hp-pc/Pictures/lee.jpeg"));
		img.setLayout(null);
		img.setBounds(350,150, 100, 50);
		 add(img);
		 setVisible(true);
		
		
	 }

	 
	 
		public void actionPerformed(ActionEvent e) {
	int num1 = Integer.parseInt(t1.getText());
	int num2 = Integer.parseInt(t2.getText());
	int value = num1 - num2;
	jl.setText(value + " ");




	
	}
}

