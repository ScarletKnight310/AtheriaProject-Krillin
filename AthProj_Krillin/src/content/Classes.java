package content;

import java.util.ArrayList;
import java.util.Arrays;
import base.*;

public class Classes extends AthContentList<AthObject>
{
	private ArrayList<AbilityScores> abilityLvls;
	
	public Classes(AthObject[] base, AbilityScores[] abiLevels) 
	{
		super(base);
		abilityLvls = new ArrayList<AbilityScores>(Arrays.asList(abiLevels));
	}
	
	//
	public void addClass(AthObject cl,AbilityScores as)
	{
		content.add(cl);
		this.abilityLvls.add(as);
	}
	
	//
	public AthObject getClass(int i) 
	{
		return content.get(i);
	}
	
	public AbilityScores getClassAL(int i)
	{
		return abilityLvls.get(i);
	}
}
