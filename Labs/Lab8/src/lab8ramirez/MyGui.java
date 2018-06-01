package lab8ramirez;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyGui extends JFrame {
String output = "";
private JLabel jlbName, jlbCategory, jlbHours;
private JTextField jtfName, jtfCategory, jtfHours;
private JButton jbnCal, jbnClear, jbnExit;
private JTextArea jtaOutput;
private Container c;
public final int WIDTH =500;
public final int LENGTH =300;
//constructor
public MyGui() {
	createInterface();
}
public void createInterface() {
	setTitle("PayRoll App");
	setSize(WIDTH, LENGTH);
	c = getContentPane();
	c.setLayout(new BorderLayout());
	
	//create JPanel p1
	JPanel p1 = new JPanel();
	p1.setLayout(new GridLayout(3,2));
	
	//jlbName add to p1
	jlbName = new JLabel("Name: ");
	jtfName = new JTextField();
	p1.add(jlbName);
	p1.add(jtfName);
	
	
	//jlbCategory add to p1
	jlbCategory = new JLabel("Category(1:Programer, 2: Sales," + "3: Office Worker ");
	jtfCategory = new JTextField();
	p1.add(jlbCategory);
	p1.add(jtfCategory);
	
	//jlbHours add to p1
	jlbHours = new JLabel("Hours Worked: ");
	jtfHours = new JTextField();
	p1.add(jlbHours);
	p1.add(jtfHours);
	
	c.add(p1, BorderLayout.NORTH);
	
	//create JPanel p2
	JPanel p2= new JPanel();
	p2.setLayout(new GridLayout(1,3));
	p2.setPreferredSize(new Dimension(500,30));
	//Create button handler
	ButtonHandler h1 = new ButtonHandler();
	
	//jbnCal
	jbnCal = new JButton("CALCULATE");
	jbnCal.addActionListener(h1);
	
	p2.add(jbnCal);
	
	//jbnClear
	jbnClear = new JButton("CLEAR");
	jbnClear.addActionListener(h1);	
	
	p2.add(jbnClear);
	
	//jbnExit
	jbnExit = new JButton("EXIT");
	jbnExit.addActionListener(h1);
	
	p2.add(jbnExit);
	
	c.add(p2, BorderLayout.CENTER);
	
	jtaOutput = new JTextArea();
	jtaOutput.setPreferredSize(new Dimension(500,120));
	c.add(jtaOutput, BorderLayout.SOUTH);
	
	pack();
	setVisible(true);
	
}
public class ButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource()==jbnCal) {
			String name = jtfName.getText();
			int job = Integer.parseInt(jtfCategory.getText());
			double hours = Double.parseDouble(jtfHours.getText());
			Payroll app1 = new Payroll(name);
			
			if(app1.checkName(name)==false||app1.checkHoursWorked(hours)==false||job > 3 ||job < 1) 
				jtaOutput.setText("Error");
			else {
				app1.setHoursWorked(hours);
				app1.setPayRate(job);
				jtaOutput.append("\nWeekly Salary for "+ app1.getName()+ " is $"+ app1.getGrossPay());
			}
				

			
		}
		if (ae.getSource()==jbnClear) {
			jtfName.setText("");
			jtfCategory.setText("");
			jtfHours.setText("");
			jtaOutput.setText("");
		}
		if (ae.getSource()==jbnExit) {
			System.exit(0);
		}
	}
}
}


