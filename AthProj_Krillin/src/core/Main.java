package core;

import base.*;

public class Main 
{
	public static Core core = new Core(true);
	
	public static void main(String[] args) 
	{
		// tweaked Stat class 
		
		core.genders.addGender(new AthObject("test",""));
		System.out.print(core.genders.getGender(0).name);
	}

}
