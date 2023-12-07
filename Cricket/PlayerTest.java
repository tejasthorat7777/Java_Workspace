import java.util.Scanner;
class PlayerTest
{
	public static void main(String[] args) {
		
		/*Player p1 = new Player("Tejas","M",22);
		Player p2 = new Player("Priyanka","F",24);
		WorldCup g1 = new WorldCup(2,1,2);
		TestMatch t1 = new TestMatch(1,1,1);
		p1.displayTestMatchDetails(t1);
		p2.displayWorldCupDetails(g1);*/

		Scanner sc = new Scanner(System.in);
		Player[] p = new Player[3];
		TestMatch[] t = new TestMatch[3];
		WorldCup[] w = new WorldCup[3];

		for(int i=0;i<p.length;i++)
		{
			p[i] = new Player();
			System.out.print("Enter name of the player ");
			p[i].setName(sc.nextLine());
			System.out.print("Enter Gender of the Player" );
			p[i].setGender(sc.nextLine());
			System.out.print("Enter Age of the Player ");
			p[i].setAge(sc.nextInt());
			t[i] = new TestMatch();
			System.out.print("Enter No of Matches played in Test Match ");
			t[i].setNo_of_games(sc.nextInt());
			System.out.print("Enter grade of the player for Test Match ");
			t[i].setGrade(sc.nextInt());
			System.out.print("Enter performance of the palyer in Test Match ");
			t[i].setPerformance(sc.nextInt());
			w[i] = new WorldCup();
			System.out.print("Enter No of Matches played in WorldCup ");
			w[i].setNo_of_games(sc.nextInt());
			System.out.print("Enter grade of the player for WorldCup ");
			w[i].setGrade(sc.nextInt());
			System.out.print("Enter performance of the palyer in WorldCup ");
			w[i].setPerformance(sc.nextInt());
			sc.nextLine();
		}

		for(int i=0;i<p.length;i++)
		{
			p[i].displayTestMatchDetails(t[i]);
		}
		for(int i=0;i<p.length;i++)
		{
			p[i].displayWorldCupDetails(w[i]);
		}
	}
}