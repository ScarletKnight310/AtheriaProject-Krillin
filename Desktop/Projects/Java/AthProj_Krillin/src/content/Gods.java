package content;

import java.util.ArrayList;
import java.util.Arrays;
import base.*;

// Gods
public class Gods extends AthContentList
{
	ArrayList<DeityTag> godinfo;
	
	public Gods(AthObject[] base,DeityTag[] godextra) 
	{
		super(base);
		this.godinfo = (ArrayList<DeityTag>) Arrays.asList(godextra);
	}
	
	public void addGod(AthObject addon, DeityTag godi)
	{
		contentList.add(addon);
		godinfo.add(godi);
	}
	
	public DeityTag getDeityTag(int i)
	{
		return godinfo.get(i);
	}
}
