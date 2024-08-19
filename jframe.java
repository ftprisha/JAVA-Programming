import javax.swing.*;
import java.awt.*;

public class jframe 
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame();
		f.setSize(400,400);
		f.setVisible(true);
		JPanel p = new JPanel();
		f.add(p);
		p.setBounds(100,100,300,300);
		JLabel l1 = new JLabel("Username");
		p.add(l1);
		JTextField t1 = new JTextField(50);
		p.add(t1);
		JLabel l2 = new JLabel("Password");
		p.add(l2);
		JTextField t2 = new JTextField(50);
		p.add(t2);
		JButton b1 = new JButton("Login");
		p.add(b1);
		p.setLayout(new GridLayout(3,1));
	}
}