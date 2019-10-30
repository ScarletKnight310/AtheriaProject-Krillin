package content;

import java.util.ArrayList;
import java.util.Arrays;
import base.AthObject;

public abstract class AthContentList
{
	protected ArrayList <AthObject> contentList;

	public AthContentList(AthObject[] baseContent) 
	{
		contentList = (ArrayList <AthObject>) Arrays.asList(baseContent);
	}
	
	public AthObject getAthObject(int i) 
	{
		return contentList.get(i);
	}

}
