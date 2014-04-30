import java.util.Scanner;

public class TestScoreDriver 
{

	public static void main(String[] args) throws InvalidTestScore 
	{
		double[] scores = {20, 30, -40, 50, 60, 70};
		
		try 
		{
			TestScores t1 = new TestScores(scores);
			TestScores.calcAvg(scores);
		}
		catch (InvalidTestScore ex)
		{
			System.out.print(ex.getMessage());
		}
		
	}

}
