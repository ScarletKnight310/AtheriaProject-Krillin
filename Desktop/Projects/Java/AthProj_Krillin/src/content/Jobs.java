package content;

import base.*;

public class Jobs extends AthContentList
{
	public Jobs(AthObject[] base) 
	{
		super(base);
	}
	
	//
	public void addJob(AthObject addon)
	{
		content.add(addon);
	}
	
	//
	public AthObject getJob(int i) 
	{
		return content.get(i);
	}
}
