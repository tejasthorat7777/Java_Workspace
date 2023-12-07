public class Player
{
	private String name,gender;
	private int age;

	Player(){}
	Player(String name, String gender, int age)
	{
		this.name = name;
		this. gender = gender;
		this.age = age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void displayTestMatchDetails(TestMatch g1)
	{	
		System.out.println("++++++++++++++++++TESTMATCH++++++++++++++++++++");
		System.out.println("Name of the player is "+this.name);
		System.out.println("Age of the Player is "+this.age);
		System.out.println("Gender of the Player is "+this.gender);
		System.out.println("Income of the player is "+g1.calculateIncome(g1.getNo_of_games()));
		System.out.println("Bonus of the player is "+g1.calculateBonus(g1.getGrade(),g1.getPerformance()));
		System.out.println("_________________________________________________");
	}
	public void displayWorldCupDetails(WorldCup g1)
	{	
		System.out.println("+++++++++++++++++++++WORLDCUP++++++++++++++++++++");
		System.out.println("Name of the player is "+this.name);
		System.out.println("Age of the Player is "+this.age);
		System.out.println("Gender of the Player is "+this.gender);
		System.out.println("Income of the player is "+g1.calculateIncome(g1.getNo_of_games()));
		System.out.println("Bonus of the player is "+g1.calculateBonus(g1.getGrade(),g1.getPerformance()));
		System.out.println("___________________________________________________");
	}
}