package content;

import base.*;

public class Genders extends AthContentList
{
	public Genders(AthObject[] base) 
	{
		super(base);
	}
	
	public void addGender(AthObject addon)
	{
		contentList.add(addon);
	}
}
