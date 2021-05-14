import java.awt.*;
import java.awt.event.*;
public class Awt_Example8 extends Frame implements ActionListener{

	public TextArea t = new TextArea();
	Awt_Example8()
	{
		Frame f=new Frame("Menu Example");
			
		f.add(t);
		
		MenuBar mb=new MenuBar();
		Menu m1=new Menu("Menu1");
		Menu m2=new Menu("Menu2");
		Menu submenu=new Menu("Sub menu");
		MenuItem mi1=new MenuItem("Item 1.a");
		mi1.setActionCommand("Item 1.a");
		MenuItem mi2=new MenuItem("Item 2.a");
		mi2.setActionCommand("Item 2.a");
		//MenuItem mi3=new MenuItem("Sub Menu");
		MenuItem mi4=new MenuItem("Item 1.b");
		mi4.setActionCommand("Item 1.b");
		MenuItem mi5=new MenuItem("Item 2.b");
		mi5.setActionCommand("Item 1.b");
		MenuItem mi6=new MenuItem("Item A.Sub Menu.a");
		mi6.setActionCommand("Item A.Sub Menu.a");
		MenuItem mi7=new MenuItem("Itme B.Sub Menu.a");
		mi7.setActionCommand("Item B.Sub Menu.a");
		
		
		
		m1.add(mi1);
		m1.add(mi2);
		m1.add(submenu);
		submenu.add(mi6);
		submenu.add(mi7);
		m2.add(mi4);
		m2.add(mi5);
		mb.add(m1);
		mb.add(m2);
		
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi4.addActionListener(this);
		mi5.addActionListener(this);
		mi6.addActionListener(this);
		mi7.addActionListener(this);
		
		f.setMenuBar(mb);
		f.setSize(300,600);
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		t.setText("Menu Selected : "+e.getActionCommand());		
	}
	public static void main(String ARRAY[])
	{
		Awt_Example8 a=new Awt_Example8();
	}
}
