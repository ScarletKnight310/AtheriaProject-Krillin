package character;

import java.util.HashMap;

import base.*;

public class AthCharacter
{
	public HashMap<String,Stat> stats = new HashMap<>();
	public HashMap<Character, AthObject> status_Being = new HashMap<>();
	public Status status_Current;
	public Inventory inv;

	private String name = "Nemo Nihil";
	private String header;
	private String background;
	private String stats_display;

	public AthCharacter(AthObject[] stat_B)
	{
		// stats
		stats.put("STR",new Stat("STR","Physical strength and damage with melee weapons."));//0
		stats.put("INT",new Stat("INT","Perception and base knowledge of the physical world."));//1
		stats.put("WIL",new Stat("WIL","Mental resistance; how far your mind can take you when your legs won’t move."));//2
		stats.put("CHR",new Stat("CHR","Your level of attractiveness and ability to sway others opinions and prices."));//3
		stats.put("WIS",new Stat("WIS","Your level of faith and capacity to perform Miracles and curses. As well as your knowledge of religious costumes. Magical resistance also falls in this category"));//4
		stats.put("DEX",new Stat("DEX","Your ability with ranged weapons as well as your skills in stealth."));//5
		stats.put("CAS",new Stat("CAS","Your mana store as well as your ability to cast spells. In addition to that your knowledge of the mystical art."));//6
		stats.put("CON",new Stat("CON","Your physical resistance and health (your health is = to your constitution unless your con is less than 5; in that case your health = 5)"));//7
		stats.put("SPD",new Stat("SPD","How quickly and efficiently you move through the environment also determines your reaction time. (This can affect all other skills)"));//8
		stats.put("CRA",new Stat("CRA","Your ability to create objects using the tools at your disposal; can be physical such as a piece of machinery, spiritual such as an enchantment, or mystical such as alchemy."));//9
		// status being
		status_Being.put('g',stat_B[0]);
		status_Being.put('R',stat_B[1]);
		status_Being.put('r',stat_B[2]);
		status_Being.put('c',stat_B[3]);
		status_Being.put('j',stat_B[4]);
		status_Being.put('d',stat_B[5]);
		status_Being.put('o',stat_B[6]);
		// status current
		inv = new Inventory();
		// moving observed stats 
		status_Current = new Status(stats.get("CON"),stats.get("CAS"));
		// Update to base
		updateAllStats();
		update();
	}

	public AthCharacter(String name, AthObject[] stat_B)
	{
		this(stat_B);
		this.name = name;
		updateHeader();
	}
	
	// update methods
	public void update()
	{
		updateHeader();
		updateBackground();
		updateStatDisplay();
	}
	
	public void updateHeader()
	{
		StringBuilder str = new StringBuilder(name).append(" / ").append(status_Being.get('g').name.charAt(0)).append(" -> ");
		header = str.append(status_Being.get('r').name).append(" ").append(status_Being.get('R').name).toString();
	}
	
	public void updateBackground()
	{
		StringBuilder str = new StringBuilder("Race: ").append(status_Being.get('r').name).append(" ").append(status_Being.get('R').name);
		str.append("\nClass/Last Occ: ").append(status_Being.get('c').name).append(" / ").append(status_Being.get('j').name);
		str.append("\nUpbringing: ").append(status_Being.get('o').name);
		str.append("\nGod: ").append(status_Being.get('d').name);
		background = str.toString();
	}

	public void updateStatDisplay()
	{
		StringBuilder str = new StringBuilder("Stats:\n");
		stats.forEach((k,v) ->{
			str.append(k).append(" ").append(v.getBonus()).append(" -> ").append(v.getMod()).append("\n");
		});
		stats_display = str.toString();
	}

	private void updateAllStats()
	{
		status_Being.forEach((k,v) ->{
			for(Stat s: v.getStats())
			{
				// the current background object single stat
				updateStat(s);
			}
		});
	}
	
	public void updateStat(Stat s)
	{
		try {
			stats.get(s.name).modifyBonus(s.getBonus());
		}
		catch(NullPointerException e)
		{
			//System.out.println("Problem");
		}
	}

	// getting extra obj
	public String getHeader()
	{
		return header;
	}
	
	public String getBackground()
	{
		return background;
	}

	public String getStats()
	{
		return stats_display;
	}
}