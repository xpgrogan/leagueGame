import java.util.*;

public class Enemy 
{
	Ability a = new Ability();
	String name;
	String description;
	{
	if(a.name == "Javelin Toss")
	{
		name = "Nidalee the Bestial Huntress\n";
		description = "Nidalee was taught to fight by her feline family, battling viciously with tooth and nail. \n"
				+ "Something in her feline ways may draw you to her, but remember that she is no pussycat.";
	}
	else if(a.name == "Trueshot Barrage")
	{
		name = "Ezreal the Prodigal Explorer\n";
		description = "During an expedition to the buried ruins of ancient Shurima, he recovered an amulet of incredible mystical power.\n "
				+ "Likely constructed to be worn by one of the Ascended, the enormous talisman nonetheless fit snugly upon his arm, \n"
				+ "amplifying his raw sorcerous skill to such an extent that he's gained the reputation of a hero, much to his embarrassment.";
	}
	else if(a.name == "Final Spark")
	{
		name = "Lux the Lady of Luminosity\n";
		description = "A light of her people, Lux's true calling was the League of Legends, \n"
				+ "where she could follow in her brother's footsteps and unleash her gifts as an inspiration for all of Demacia.";
	}
	else if(a.name == "Enchanted Crystal Arrow")
	{
		name = "Ashe the Frost Archer\n";
		description = "With Avarosa's bow and her vision of peaceful unification, Ashe's tribe soon swelled, becoming the largest in the Freljord. \n"
				+ "Now known as the Avarosan, they stand together with the belief that a united Freljord will once again become a great nation.";
	}
	else if(a.name == "Piercing Arrow")
	{
		name = "Varus the Arrow of Retribution\n";
		description = "'The life of an arrow is fleeting, built of nothing but direction and intent.'\n" +
		"-- Varus\n";
	}
	else
	{
		name = "Jinx the Loose Cannon\n";
		description = "Jinx lives to wreak havoc without a thought for the consequences, leaving a trail of mayhem and panic in her wake. \n"
				+ "A manic and impulsive criminal, she despises nothing more than boredom, and gleefully brings her own volatile brand of pandemonium to the one place she finds dullest: \n"
				+ "Piltover.";
	}
}}