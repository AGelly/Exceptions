
public class InvalidTestScore extends Exception
{
	public InvalidTestScore()
	{
		super("Error: Score greater than 100 or negative.");
	}
}
