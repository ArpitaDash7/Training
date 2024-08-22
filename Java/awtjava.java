import java.awt.*;

class Demo
{
	public static void main (String agrs[])
	{
	Frame f= new Frame();
	f.setVisible(true);
	f.setBackground(Color.red);
	f.setSize(500,500);
	Button b1= new Button("Click");
	f.add(b1);
	MenuBar mb= new MenuBar();
	f.setMenuBar(mb);
	Menu m1= new Menu("View");
	Menu m2=new Menu("file");
	mb.add(m1);
	mb.add(m2);
	MenuItem mi1= new MenuItem("New");
	MenuItem mi2= new MenuItem("Open");
	MenuItem mi3= new MenuItem("Save");
	m1.add(mi1);
	m1.add(mi2);
	m1.add(mi3);
	MenuItem mi4= new MenuItem("Cut");
	MenuItem mi5= new MenuItem("Copy");
	MenuItem mi6= new MenuItem("Paste");
	m2.add(mi4);
	m2.add(mi5);
	m2.add(mi6);
	f.setOnCloseRequest(e -> Platform.exit());


	}
}