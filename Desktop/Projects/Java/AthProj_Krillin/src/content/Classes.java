package content;

import java.util.ArrayList;
import java.util.Arrays;
import base.*;

public class Classes extends AthContentList
{
	private ArrayList<AbilityScores> abilityLvls;
	
	public Classes(AthObject[] base, AbilityScores[] abiLevels) 
	{
		super(base);
		abilityLvls = (ArrayList<AbilityScores>)Arrays.asList(abiLevels);
	}
	
	public void addClass(AthObject cl,AbilityScores as)
	{
		contentList.add(cl);
		this.abilityLvls.add(as);
	}
	
	public AbilityScores getClassAL(int i)
	{
		return abilityLvls.get(i);
	}
}
