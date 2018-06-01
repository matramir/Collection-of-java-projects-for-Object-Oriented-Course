package lab7ramirez;
import javax.swing.*;
public class MyApp {
	public static void main(String[] args) {
		String name;
		int exam;
		int numQuestions,numMissed;
		double grammar,content,score;
		CourseGrade ga = new CourseGrade();
		//do while loop for the Student name
	do {
		name=JOptionPane.showInputDialog("Enter Student Name: ");
		ga.setName(name);
		//Error Message for invalid Student Name
		if(ga.checkName()==false)
			JOptionPane.showMessageDialog(null, "Please Enter Student Name","Error", JOptionPane.ERROR_MESSAGE);
	}while(ga.checkName()==false);
	//do while loop for the Exam Type Selection
	do {
		exam = Integer.parseInt(JOptionPane.showInputDialog("Which exam you want to grade\n1: Lab Assignment\n2: Mid Term Exam\n3: Final Essay Exam"));
		//error Message for Invalid Exam Type
		if(ga.checkSelect(exam)==false)
			JOptionPane.showMessageDialog(null, "Error in Exam Selection","Error", JOptionPane.ERROR_MESSAGE);
	}while(ga.checkSelect(exam)==false);
	ga.setExam(exam);
	//Asks for the values according to the Exam Selection
	//For Lab only asks for a Lab Score
	if (exam==1) {
		score=Double.parseDouble(JOptionPane.showInputDialog("Please enter Lab Score"));
		//Sets the score for the Lab
		ga.setScore(score);
	}
	//For Mid Term exam asks for Number of Questions and Questions Missed
	else if (exam==2) {
		//student can't get a negative amount of questions for an exam
		do {
			numQuestions=Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Questions in the Exam"));
			if(numQuestions<0)
				JOptionPane.showMessageDialog(null, "Please enter a valid amount of Questions in the Exam","Error", JOptionPane.ERROR_MESSAGE);
		}while(numQuestions<0);
		//sets the Number of Questions
		ga.setQuestions(numQuestions);
		// Student can't get more Missed Questions than the total Exam Questions nor negative Missed Questions
		do {
			numMissed=Integer.parseInt(JOptionPane.showInputDialog("Enter Number Number of Questions Missed in the Exam"));
			if (numMissed>numQuestions||numMissed<0)
				JOptionPane.showMessageDialog(null, "Please enter a valid amount of Missed Questions.","Error", JOptionPane.ERROR_MESSAGE);
		}while(numMissed>numQuestions||numMissed<0);
		//set the number of Missed Questions
		ga.setMissed(numMissed);
	}
	//for a Final Essay the user needs to input a grammar score and a content score
	else{
		//Grammar score can't be more than 30 nor less than 0
		do {
			grammar=Double.parseDouble(JOptionPane.showInputDialog("Enter the Final Essay's Grammar Score(<=30)"));
			if (grammar>30||grammar<0)
				JOptionPane.showMessageDialog(null, "Please enter a valid Grammar Score","Error", JOptionPane.ERROR_MESSAGE);
		}while(grammar>30||grammar<0);
		ga.setGrammar(grammar);
		//Content score can't be more than 70 nor less than 0
		do {
			content=Double.parseDouble(JOptionPane.showInputDialog("Enter the Final Essay's Content Score(<=70)"));
			if(content>70||content<0)
				JOptionPane.showMessageDialog(null, "Please enter a valid Grammar Score","Error", JOptionPane.ERROR_MESSAGE);
		}while(content>70||content<0);
		
		ga.setContent(content);
	}	
	//return message after all inputs are entered
	JOptionPane.showMessageDialog(null, ga.getName()+"'s "+ga.getExam()+" Score is "+ga.getFScore()+" and Grade is "+ga.getGrade());
	}

}
