package content;

import base.*;

public class Jobs extends AthContentList
{
	public Jobs(AthObject[] base) 
	{
		super(base);
	}
	
	public void addJob(AthObject addon)
	{
		contentList.add(addon);
	}
}
