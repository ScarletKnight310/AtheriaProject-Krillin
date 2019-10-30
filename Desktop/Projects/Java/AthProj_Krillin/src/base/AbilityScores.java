package base;

public class AbilityScores
{
	// Fighting or Martial Art Knowledge (Power)
	private int Martial = 0;
	// Technical usage Knowledge (Courage)
	private int Technical = 0;
	// Magical or Mystical Knowledge (Wisdom)
	private int Mystical = 0;
	
	// Class Score Limits
	private static int Limit = 5;
	
	public AbilityScores(int Martial, int Technical, int Mystical)
	{
		if(Martial + Technical + Mystical == Limit)
		{
			this.Martial = Martial;
			this.Technical = Technical;
			this.Mystical = Mystical;
		}
		// Handle mal stuff
	}
	
	public int getMartialScore()
	{
		return this.Martial;
	}
	
	public int getTechnicalScore()
	{
		return this.Technical;
	}
	
	public int getMysticalScore()
	{
		return this.Mystical;
	}
}
