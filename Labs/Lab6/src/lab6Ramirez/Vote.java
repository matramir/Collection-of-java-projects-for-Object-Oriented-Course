package lab6Ramirez;
import javax.swing.*;
import java.text.*;
public class Vote {
	int totalVotes, numOfCan;
	String candidates[];
	int votes[];
	
	 public Vote(int n) {
		 numOfCan = n;
		 totalVotes = 0;
		 candidates = new String[n];
		 votes = new int[n];
	 } 	
	 public void setCandidate(String s[]) {
		 for(int i=0;i<s.length;i++) {
			candidates[i]=s[i];
		 }
	 }
	 public void setVote (int v[]) {
		 for (int i=0;i<v.length;i++) {
			 votes[i]=v[i];
		 }
	 }
	 public int getSumVotes(int list[]) {
		 totalVotes=0;
		 for (int i=0;i<list.length;i++) {
			 totalVotes+= list[i];
		 }
		 return totalVotes;
	 }
	 public int getWinnerIndex (int list[]) {
		 int winInd=0;
		 for (int i=0; i<list.length;i++) {
			 if(list[i] > list[winInd])
				 winInd=i;
		 }
		 return winInd;
	 }
	 public Object getOutput() {
		 int k;
		 totalVotes = getSumVotes(votes);
		 k = getWinnerIndex(votes);
		 double percent=0;
		 JTextArea output = new JTextArea();
		 DecimalFormat myFormat = new DecimalFormat("0.0000");
		 output.append("Candidates\tVotes Received\t\t% of Total Votes \n");
		 for (int j=0; j<candidates.length;j++) {
			 percent = ((double) votes[j]/(double) totalVotes);
			 output.append(candidates[j]+"\t\t"+votes[j]+"\t\t\t"+myFormat.format(percent)+"\n");
		 }
		 output.append("Total\t" + totalVotes+"\n");
		 output.append("The winner of the election is " +candidates[k]);
		 return output;
	 }
	 
		 
	 }