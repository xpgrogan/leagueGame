import java.util.*;


public class Ability 
{
	static final String[] ability = {"Javelin Toss", "Trueshot Barrage", 
		"Final Spark", "Enchanted Crystal Arrow", "Piercing Arrow", 
		"Super Mega Death Rocket!"};
	static final int[] attackPosition = {1, 2, 3};
	Random random = new Random();
	int index = random.nextInt(ability.length);
	String name = ability[index];
	int position = random.nextInt(attackPosition.length);
	
}
