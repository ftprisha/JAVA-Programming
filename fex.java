import java.awt.*;
public  class fex extends Frame{
	public static void main(String[] args){
		Frame f=new Frame("hello");
		f.setSize(400,400);
		f.setVisible(true);
		f.setBackground(Color.yellow);
		Panel p = new Panel();
		f.add(p);
		p.setBounds(100,100,300,300);
		Label l1 = new Label("Enter name");
		p.add(l1);
		TextField t1 = new TextField(50);
		p.add(t1);
		Label l2 = new Label("Enter age");
		p.add(l2);
		TextField t2 = new TextField(50);
		p.add(t2);
		Label l3 = new Label("Gender");
		p.add(l3);
		Checkbox c1 = new Checkbox("Male");
		p.add(c1);
		Checkbox c2 = new Checkbox("Female");
		p.add(c2);
		Button b1 = new Button("Register");
		p.add(b1);
	}
}