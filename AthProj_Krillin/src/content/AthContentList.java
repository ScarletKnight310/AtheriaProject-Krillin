package content;

import java.util.ArrayList;
import java.util.Arrays;
import base.*;

public abstract class AthContentList
{
	protected ArrayList <AthObject> content;
	
	public AthContentList(AthObject[] baseContent) 
	{
		content = new ArrayList<AthObject>(Arrays.asList(baseContent));
	}
	
	protected ArrayList<ArrayList<AthObject>> to2dArrayList(AthObject[][] arr2d) 
	{
		ArrayList<ArrayList<AthObject>> result = new ArrayList<>();
		for(int i = 0; i < arr2d.length; i++)
		{
			result.add(new ArrayList<AthObject>(Arrays.asList(arr2d[i])));
		}
		return result;
	}
}
