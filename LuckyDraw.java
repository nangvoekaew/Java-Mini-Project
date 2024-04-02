import java.util.Random;

import javax.swing.JOptionPane;

public class LuckyDraw {

	public void Event() {
		Random luckydraw = new Random();
		int start = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number to start from","Start Number",1));
		int end = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number to end","End Number",1));
		
		JOptionPane.showMessageDialog(null, "The random winner number will be chosen starting from " + start + " , ending in " + end,"Choose Random",1);
		
		int winner = luckydraw.nextInt(end - start + 1) + start; //from int start to int end
		
		System.out.println("                Envent Lucky Draw                 ");
		System.out.println("--------------------------------------------------");
		System.out.println("We will give the prize by choosing a random number \n"
				+ "according to patients' room numbers");
		System.out.println("**************************************************");
		System.err.println("          The winner number is : " + winner);
		System.out.println("**************************************************");
		System.out.println(" Thank you! May you be lucky in the next events!");
		System.out.println("--------------------------------------------------");
	}
}
