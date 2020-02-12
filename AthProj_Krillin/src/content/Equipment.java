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

//	private int getPrice(int t, int i)
//	{
//		return contentList.get(.size());
//	}
}
