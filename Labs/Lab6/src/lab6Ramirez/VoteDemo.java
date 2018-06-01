package lab6Ramirez;
import javax.swing.*;
public class VoteDemo {
	public static void main (String[] args) {
		int numCan=0;
		numCan =Integer.parseInt(JOptionPane.showInputDialog("How many candidates in this election?"));
		Vote app =new Vote(numCan);
		String[] can = new String[numCan];
		int[] voteReceived = new int[numCan];
		
		for(int i=0; i < numCan;i++) {
			can[i] = JOptionPane.showInputDialog("Enter candidate's name:");
			voteReceived[i]= Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of votes received by "+ can[i]));
		}
		app.setCandidate(can);
		app.setVote(voteReceived);
		JOptionPane.showMessageDialog(null, app.getOutput());
			
	}
}