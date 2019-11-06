package base;

public class AbilityScores
{
	// Fighting or Martial Art Knowledge (Power)
	private int Martial = 0;
	// Technical usage Knowledge (Courage)
	private int Technical = 0;
	// Magical or Mystical Knowledge (Wisdom)
	private int Mystical = 0;
	
	public AbilityScores(int Martial, int Technical, int Mystical)
	{
			this.Martial = Martial;
			this.Technical = Technical;
			this.Mystical = Mystical;
	}
	
	//
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
	
	//
	public String toString()
	{
		return "Martial - lvl "+ this.Martial + ", Technical - lvl "+ this.Technical + ", Mystical - lvl "+ this.Mystical;
	}
	
}
