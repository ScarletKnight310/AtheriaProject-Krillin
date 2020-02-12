package content;

import java.util.ArrayList;
import base.*;


public class NPCs extends AthContentList<AthObject>
{
	ArrayList<ArrayList<AthObject>> npcs;
	
	public NPCs(AthObject[][] baseNpcs,AthObject[] deityDomain) 
	{
		super(deityDomain);
		npcs = to2dArrayList(baseNpcs);
	}
	
	//
	public void addGodNPC(AthObject addon, AthObject godi)
	{
		content.add(godi);
		npcs.get(0).add(addon);
	}
	
	public void addNPC(AthObject addon)
	{
		npcs.get(1).add(addon);
	}
	
	//
	private AthObject getNPC(int t, int i)
	{
		return npcs.get(t).get(i);
	}
	
	public AthObject getGodDomain(int i) 
	{
		return content.get(i);
	}
	
	public AthObject getGodNPC(int i)
	{
		return getNPC(0,i);
	}
	
	public AthObject getNPC(int i)
	{
		return getNPC(1,i);
	}
}
