package core;

import content.*;
import base.*;

public class Core 
{ 
	protected static Genders genders;
	private static Races races;
	private static Classes classes;
	private static Gods gods;
	private static Origins origins;
	private static Jobs jobs;
	
	public Core() 
	{
			genders = new Genders( new AthObject[] {
					new AthObject("Male","idk"),
					new AthObject("Female","idk"),
					new AthObject("Other","idk")
			});
		
	}

}
