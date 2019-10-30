package content;

import java.util.ArrayList;
import java.util.Arrays;

import base.*;

public class Races extends AthContentList
{
	private ArrayList<ArrayList<AthObject>> subRaces;
	
	public Races(AthObject[] base, ArrayList<AthObject>[] subRaceBase) 
	{
		super(base);
		subRaces = (ArrayList<ArrayList<AthObject>>) Arrays.asList(subRaceBase);
	}
	
	public void addRace(AthObject addon)
	{
		contentList.add(addon);
		subRaces.add(new ArrayList<>());
	}
	
	public void addSubRace(AthObject addon, AthObject race)
	{
		addSubRaces(new AthObject[] {addon},race);
	}
	
	public void addSubRaces(AthObject[] addons, AthObject race)
	{
		int indexOfRace = contentList.indexOf(race);
		if(indexOfRace != -1)
		{
			for(AthObject addon: addons)
			{
				subRaces.get(indexOfRace).add(addon);
			}
		}
	}
	
	public AthObject getSubRace(int race, int subrace)
	{
		return subRaces.get(race).get(subrace);
	}
}
