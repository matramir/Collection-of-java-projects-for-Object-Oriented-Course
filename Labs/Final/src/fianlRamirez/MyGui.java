package fianlRamirez;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyGui extends JFrame {
	private Container c;
	private JPanel p1,p2,p3,p4;
	private JLabel jlbSelectTitle;
	private JRadioButton jrbGeneral, jrbStudent;
	private JComboBox jcbWorkshop;
	private JButton jbnCalculate, jbnExit;
	private ButtonGroup bg;
	
	public MyGui(){
		setTitle("Final Project");
		
		c= getContentPane();
		c.setLayout(new BorderLayout());
		
		//this creates the north part of the panel with the JLabel and adds it to the container, the label should be aligned to the left.
		p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jlbSelectTitle = new JLabel("Select Registration Options");
		p1.add(jlbSelectTitle);
		c.add(p1,BorderLayout.NORTH);
		
		//calls a method to create the west panel and adds it to the container
		buildRegPanel();
		c.add(p2,BorderLayout.WEST);
		
		//calls a method to create the east panel and adds it to the container
		buildWorkshopPanel();
		c.add(p3,BorderLayout.EAST);
		
		//calls a method to create the south panel and adds it to the container
		buildButtonPanel();
		c.add(p4,BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
	
	private void buildRegPanel() {
		p2 = new JPanel();
		//set text for the radio buttons
		jrbGeneral= new JRadioButton();
		jrbGeneral.setText("General Registration");
		jrbStudent = new JRadioButton();
		jrbStudent.setText("Student Registration");
		
		//This is because an option should be already selected
		jrbGeneral.setSelected(true);
		
		//adds radio buttons to buttongroup
		bg = new ButtonGroup();
		bg.add(jrbGeneral);
		bg.add(jrbStudent);
		
		//adds it to the panel
		p2.add(jrbGeneral);
		p2.add(jrbStudent);
		
	}
	private void buildWorkshopPanel() {
		p3= new JPanel();
		
		jcbWorkshop = new JComboBox();
		jcbWorkshop.addItem("Introduction to E-Commerce");
		jcbWorkshop.addItem("The Internet of Things");
		jcbWorkshop.addItem("Web Application Development");
		jcbWorkshop.addItem("Internet Security");
		
		p3.add(jcbWorkshop);
	}
	private void buildButtonPanel() {
		p4= new JPanel();
		
		jbnCalculate= new JButton("Calculate Charges");
		jbnExit = new JButton("Exit");
		
		ButtonHandler h = new ButtonHandler();
		jbnCalculate.addActionListener(h);
		jbnExit.addActionListener(h);
		
		p4.add(jbnCalculate);
		p4.add(jbnExit);
		
	}
	public class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==jbnCalculate) {
				Registration r= new Registration();
				int wSelected = jcbWorkshop.getSelectedIndex();
				r.setWorkShopCost(wSelected);
				if(jrbGeneral.isSelected()) {
					r.setRegistrationCost(1);
				}
				else {
					r.setRegistrationCost(2);
				}
				String fmessage = "Total Charges= $" + r.getTotal();
				JOptionPane.showMessageDialog(null, fmessage);
			}
			if (e.getSource()==jbnExit)
				System.exit(0);
					
		}
	}
}
