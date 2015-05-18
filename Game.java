import java.util.*;

public class Game
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
		Scanner scan = new Scanner(System.in);
		Enemy e = new Enemy();
		int flash;
		int score = 0;
		boolean hitOrMiss = false;
		
		while(hitOrMiss == false)
		{
			e = new Enemy();
			if(score < 5)
			{	
				System.out.println("SUMMONING ENEMY!\n");
				System.out.println(e.name);
				System.out.println(e.description);
				System.out.println("\nUsing attack: " + e.a.name);
				System.out.println("\nYour score so far: " + score);
				System.out.println("\nWhich way will you flash?!?!?!?!\n");
				System.out.println("Enter 1 for left, 2 for middle(stay), or 3 for right!\n Choice: ");
				flash = scan.nextInt();
		
				if(flash == 1)
					flash = 0;
				else if(flash == 2)
					flash = 1;
				else if(flash == 3)
					flash = 2;
				else
				{
					System.out.println("You broke it");
					System.exit(1);
				}
		
				hitOrMiss = hit(e.a.position, flash);
				if(hitOrMiss == false)
				{
					System.out.println("You live to fight another day on the Fields of Justice!");
					score += 1;
				}	
				else
				{
					System.out.println("You got #REKT m8!!!");
					System.out.println("DEFEAT");
					System.exit(1);
				}
			}
			else
			{
				System.out.println("VICTORY!!!!!!!");
				System.exit(1);
			}
		}	
	}
}
