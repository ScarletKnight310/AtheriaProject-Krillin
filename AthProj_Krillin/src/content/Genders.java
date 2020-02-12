package content;

import base.*;

public class Genders extends AthContentList<AthObject>
{
	public Genders(AthObject[] base) 
	{
		super(base);
	}
	
	//
	public void addGender(AthObject addon)
	{
		content.add(addon);
	}
	
	//
	public AthObject getGender(int i) 
	{
		return content.get(i);
	}
}
