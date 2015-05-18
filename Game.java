import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Game extends JFrame
{
	public static boolean hit(int ap, int fl)
	{
		int pos = ap;
		int fla = fl;
		
		if(pos == fla)
			return true;
		else
			return false;
	}
	
	public static void main (String [] args)
	{
		//Scanner scan = new Scanner(System.in);
		Enemy e = new Enemy();
		int flash;
		int score = 0;
		boolean hitOrMiss = false;
		//JOptionPane.showInputDialog("Enter your name");
		
		while(hitOrMiss == false)
		{
			e = new Enemy();
			if(score < 5)
			{
				flash = Integer.parseInt(JOptionPane.showInputDialog("SUMMONING ENEMY!\n"+
													e.name +"\n" + e.description +
													"\nUsing attack: " +e.a.name+
													"\nYour score so far: " + score+
													"\nWhich was will you flash?!?!?!?!\n"+
													"Enter 1 for left, 2 for middle(stay), or 3 for right!\n"+
													"Choice: "));
				
				
//				System.out.println("SUMMONING ENEMY!\n");
//				System.out.println(e.name);
//				System.out.println(e.description);
//				System.out.println("\nUsing attack: " + e.a.name);
//				System.out.println("\nYour score so far: " + score);
//				System.out.println("\nWhich way will you flash?!?!?!?!\n");
//				System.out.println("Enter 1 for left, 2 for middle(stay), or 3 for right!\n Choice: ");
//				flash = scan.nextInt();
		
				if(flash == 1)
					flash = 0;
				else if(flash == 2)
					flash = 1;
				else if(flash == 3)
					flash = 2;
				else
				{
					JOptionPane.showMessageDialog(null, "You broke it!!!!!! :(");
					//System.out.println("Broke it");
					System.exit(1);
				}
		
				hitOrMiss = hit(e.a.position, flash);
				if(hitOrMiss == false)
				{
					JOptionPane.showMessageDialog(null,"You live to fight another day on the Fields of Justice!");
					//System.out.println("You live to fight another day on the Fields of Justice!");
					score += 1;
				}	
				else
				{
					JOptionPane.showMessageDialog(null,"You got #REKT m8!!!");
					JOptionPane.showMessageDialog(null, "DEFEAT!!!");
					//System.out.println("You got #REKT m8!!!");
					System.exit(1);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "VICTORY!!!!!");
				//System.out.println("VICTORY!!!!!!!");
				System.exit(1);
			}
		}	
	}
}
