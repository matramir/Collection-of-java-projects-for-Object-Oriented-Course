package lab7ramirez;

public class CourseGrade extends GradeActivity {
private int numQuestions, numMissed;
private double pointsEach, mScore, grammar, content, fScore;
public CourseGrade() {
	numQuestions=0;
	numMissed=0;
	pointsEach=0.0;
	mScore=0.0;
	grammar=0.0;
	content=0.0;
	fScore=0.0;
	}
public boolean checkSelect(int se) {
	if(se==1||se==2||se==3)
		return true;
	else
		return false;
}
public void setQuestions(int q) {
	numQuestions=q;
	pointsEach=100/numQuestions;
}
public int getQuestions() {
	return numQuestions;
}
public void setMissed(int m) {
	numMissed=m;
	mScore=pointsEach*numMissed;
}
public int getMissed() {
	return numMissed;
}
public double getPointsEach() {
	return pointsEach;
}
public double getMScore() {
	return mScore;
}
public void setGrammar(double gr){
	grammar=gr;
}

public void setContent(double co) {
	content=co;
}
public double getGrammar() {
	return grammar;
}
public double getContent() {
	return content;
}
public double getFScore() {
if(getExam()=="Lab Assignment") 
	fScore=getScore();
else if(getExam()=="Mid Term Exam") {
	fScore=100-mScore;
	setScore(fScore);
}
else if(getExam()=="Final Essay Exam") {
	fScore=grammar+content;
	setScore(fScore);
}
return fScore;
}
}
