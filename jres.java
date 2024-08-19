import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jres {
    public static void main(String[] args) {
        JFrame f = new JFrame("Bio Data Form");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(14, 2, 5, 5)); 

        JLabel l1 = new JLabel("Name");
        p.add(l1);
        JTextField t1 = new JTextField(20);
        p.add(t1);

        JLabel l2 = new JLabel("Father's Name");
        p.add(l2);
        JTextField t2 = new JTextField(20);
        p.add(t2);

        JLabel l3 = new JLabel("Mother's Name");
        p.add(l3);
        JTextField t3 = new JTextField(20);
        p.add(t3);

        JLabel l4 = new JLabel("Date of Birth");
        p.add(l4);
        JTextField t4 = new JTextField(20);
        p.add(t4);

        JLabel l5 = new JLabel("Gender");
        p.add(l5);
        JTextField t5 = new JTextField(20);
        p.add(t5);

        JLabel l6 = new JLabel("Age");
        p.add(l6);
        JTextField t6 = new JTextField(20);
        p.add(t6);

        JLabel l7 = new JLabel("Address");
        p.add(l7);
        JTextField t7 = new JTextField(20);
        p.add(t7);

        JLabel l8 = new JLabel("Blood Group");
        p.add(l8);
        JTextField t8 = new JTextField(20);
        p.add(t8);

        JLabel l9 = new JLabel("Qualification");
        p.add(l9);
        JTextField t9 = new JTextField(20);
        p.add(t9);

        JLabel l10 = new JLabel("Hobbies");
        p.add(l10);
        JTextField t10 = new JTextField(20);
        p.add(t10);

        JLabel l11 = new JLabel("Phone Number");
        p.add(l11);
        JTextField t11 = new JTextField(20);
        p.add(t11);

        JLabel l12 = new JLabel("Email");
        p.add(l12);
        JTextField t12 = new JTextField(20);
        p.add(t12);

        JButton b1 = new JButton("Register");
        p.add(b1);

        f.add(p);
        f.setVisible(true);
	
	b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Form Submitted", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        f.add(p);
        f.setVisible(true);
    }
}