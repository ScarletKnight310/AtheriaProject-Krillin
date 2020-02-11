package content;

import java.util.ArrayList;
import java.util.Arrays;
import base.AthObject;

public class Traits extends AthContentList
{
	private ArrayList<Integer> balScores;
	
	public Traits(AthObject[] baseContent, Integer[] balScore)
	{
		super(baseContent);
		balScores = new ArrayList<Integer> (Arrays.asList(balScore)); 
	}
	
	//
	public void addTrait(AthObject addon, int balScore)
	{
		content.add(addon);
		balScores.add(balScore);
	}
	
	//
	public AthObject getTrait(int i) 
	{
		return content.get(i);
	}
	
	public int getBalScore(int i)
	{
		return balScores.get(i);
	}

}
