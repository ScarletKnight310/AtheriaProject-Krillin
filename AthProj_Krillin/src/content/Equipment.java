package content;

import base.AthObject;

import java.util.ArrayList;

public class Equipment extends AthContentList<Integer>
{
    private ArrayList<ArrayList<AthObject>> equipment;

    public Equipment(AthObject[][] equipment, Integer[] prices)
    {
        super(prices);
        this.equipment = to2dArrayList(equipment);
    }

    // itergrate so lambdas later
    public AthObject getItem(int t, int i)
    {
        return equipment.get(t).get(i);
    }

    public AthObject getRangedWeapon(int i)
    {
        return getItem(0,i);
    }

    public AthObject getMeleeWeapon(int i)
    {
        return getItem(1,i);
    }

    public AthObject getSpecialWeapon(int i)
    {
        return getItem(2,i);
    }

    public AthObject getArmor(int i)
    {
        return getItem(3,i);
    }

    public int getPrice(int i)
    {
        return content.get(i);
    }

    @Override
    public String ContentToString()
    {
        StringBuilder str = new StringBuilder();
        for(ArrayList<AthObject> layer: equipment)
        {
            for(AthObject c: layer)
            {
                str.append(c.toString()).append("\n");
            }
        }
        return str.toString();
    }
//	private int getPrice(int t, int i)
//	{
//		return contentList.get(.size());
//	}
}
