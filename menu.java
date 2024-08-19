import java.awt.*;
public  class menu extends Frame{
	public static void main(String[] args){
		Frame f=new Frame("hello");
		f.setSize(400,400);
		f.setVisible(true);
	
		MenuBar mb = new MenuBar();
		f.setMenuBar(mb);
		Menu m1= new Menu("file");
		mb.add(m1);
		MenuItem i1=new MenuItem("open");
		m1.add(i1);
		MenuItem i2= new MenuItem("save");
		m1.add(i2);
		Menu m2=new Menu("edit");
		mb.add(m2);
		MenuItem i3=new MenuItem("copy");
		m2.add(i3);
		MenuItem i4=new MenuItem("paste");
		m2.add(i4);
		Menu sub = new Menu("paste");
		m1.add(sub);
		MenuItem i5=new MenuItem("spl");
		sub.add(i5);
		
	}
}