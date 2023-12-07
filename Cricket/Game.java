public abstract class Game
{	
	private int no_of_games;
	private int grade;
	private int performance;
	Game(){}
	Game(int no_of_games, int grade, int performance)
	{
		no_of_games = no_of_games;
		grade = grade;
		performance = performance;
	}
	abstract double calculateIncome(int no_of_games);
	abstract double calculateBonus(int grade, int performance);
}
