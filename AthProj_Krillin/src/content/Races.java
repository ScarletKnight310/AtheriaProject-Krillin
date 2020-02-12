package content;

import java.util.ArrayList;
import base.*;

public class Races extends AthContentList<AthObject>
{
	private ArrayList<ArrayList<AthObject>> subRaces;
	
	public Races(AthObject[] base, AthObject[][] subRaceBase) 
	{
		super(base);
		subRaces = to2dArrayList(subRaceBase);
	}

	public void addRace(AthObject addon)
	{
		content.add(addon);
		subRaces.add(new ArrayList<>());
	}
	
	public void addSubRace(AthObject addon, AthObject race)
	{
		addSubRaces(new AthObject[] {addon},race);
	}
	
	public void addSubRaces(AthObject[] addons, AthObject race)
	{
		int indexOfRace = content.indexOf(race);
		if(indexOfRace != -1)
		{
			for(AthObject addon: addons)
			{
				subRaces.get(indexOfRace).add(addon);
			}
		}
	}
	
	public AthObject getRace(int i) 
	{
		return content.get(i);
	}
	
	public AthObject getSubRace(int race, int subrace)
	{
		return subRaces.get(race).get(subrace);
	}
}
