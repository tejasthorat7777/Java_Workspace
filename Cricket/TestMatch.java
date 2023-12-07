
public class TestMatch extends Game
{	
	private int no_of_games,grade,performance;
	private final int fee_per_match = 20000;

	TestMatch(){};
	TestMatch(int no_of_games,int grade, int performance)
	{	
		super(no_of_games,grade,performance);
		this.no_of_games = no_of_games;
		this.grade = grade;
		this.performance = performance;
	}
	public void setNo_of_games(int no_of_games)
	{
		this.no_of_games=no_of_games;
	}
	public void setGrade(int grade)
	{
		this.grade = grade;
	}
	public void setPerformance(int performance)
	{
		this.performance= performance;
	}

	public int getNo_of_games(){return this.no_of_games;}
	public int getGrade(){return this.grade;}
	public int getPerformance(){return this.performance;}

	@Override
	public double calculateIncome(int no_of_games)
	{
		double income = no_of_games * fee_per_match;
		return income;
	}

	@Override
	public double calculateBonus(int grade, int performance)
	{	
		double bonus;
		if(grade==1)
		{	
			bonus = 10000;
			int i=1;
			while(i<4)
			{
				if(performance != i)
				{
					bonus = bonus - 2000;
					i++;
				}else{break;}
			}
		}
		else if(grade==2)
		{	
			bonus = 8000;
			int i=1;
			while(i<4)
			{
				if(performance != i)
				{
					bonus = bonus - 2000;
					i++;
				}else{break;}
			}
		}
		else
		{	
			bonus = 6000;
			int i=1;
			while(i<4)
			{
				if(performance != i)
				{
					bonus = bonus - 2000;
					i++;
				}else{break;}
			}
		}
		return bonus;
	}

}