package lab7ramirez;

public class GradeActivity {
protected String name;
private String exam;
private double score;
private char letterGrade;
public GradeActivity() {
	name="";
	exam="";
	score=0.0;	
}
public void setName(String n) {
	name=n;
}
public String getName(){
	return name;
}
public boolean checkName() {
	if (name=="")
		return false;
	else
		return true;
}
public void setExam(int e) {
	if (e==1)
		exam="Lab Assignment";
	else if (e==2)
		exam="Mid Term Exam";
	else if (e==3)
		exam="Final Essay Exam";
}
public String getExam() {
	return exam;
}
public void setScore(double s){
	score=s;
	if (score<60)
		letterGrade='F';
	else if(score<70)
		letterGrade='D';
	else if(score<80)
		letterGrade='C';
	else if(score<90)
		letterGrade='B';
	else
		letterGrade='A';
}
public double getScore() {
	return score;
}
public char getGrade() {
	return letterGrade;
}
}
