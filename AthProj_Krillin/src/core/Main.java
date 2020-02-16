package core;

import base.*;
import character.AthCharacter;

public class Main 
{
	public static Core core = new Core(true);
	
	public static void main(String[] args) 
	{
//		core.genders.addGender(new AthObject("test",""));
//		System.out.println(core.genders.getGender(3).name);

		AthCharacter test = new AthCharacter("Alto", new AthObject[]{
				core.genders.getGender(0),
				core.races.getRace(2),
				core.races.getSubRace(2,5),
				core.classes.getClass(0),
				core.jobs.getJob(0),
				core.npcs.getGodNPC(0),
				core.origins.getOrigin(4)});

//		System.out.println(test.getHeader());
//		System.out.println(test.getBackground());
//		test.inv.addItem(core.equipment.getMeleeWeapon(24));
//		System.out.println(test.inv.toString());
//		System.out.println(test.status_Current.toString());
//		System.out.println(test.getStats());
		System.out.println(core.toString());
	}

}
