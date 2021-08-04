package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton add = new JButton("Add Name");
	JButton view = new JButton("View Names");
	String name;
	ArrayList<String> nameList = new ArrayList<String>();
	
	GuestBook() {
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.add(p);
		
		p.add(add);
		p.add(view);
		
		add.addActionListener(this);
		view.addActionListener(this);
		
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			name = JOptionPane.showInputDialog("Input name you would like to add.");
			nameList.add(name);
		} else {
			for (String a: nameList) {
				System.out.println(a);
			}
		}
	}
}
