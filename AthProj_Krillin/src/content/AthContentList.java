package content;

import java.util.ArrayList;
import java.util.Arrays;
import base.*;

public abstract class AthContentList<T>
{
	protected ArrayList <T> content;
	
	public AthContentList(T[] baseContent)
	{
		content = new ArrayList<T>(Arrays.asList(baseContent));
	}
	
	protected <I> ArrayList<ArrayList<I>> to2dArrayList(I[][] arr2d)
	{
		ArrayList<ArrayList<I>> result = new ArrayList<>();
		for(int i = 0; i < arr2d.length; i++)
		{
			result.add(new ArrayList<I>(Arrays.asList(arr2d[i])));
		}
		return result;
	}
}
