package orderpkg;
import cdpkg.*;
import java.util.Scanner;

class BuyCD
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num,num1,idCheck;
		double price1,price2;
		int number;
		String ch;

		System.out.print("Enter how many Cd records you want to collect ");
		num = sc.nextInt();

		CompactDisc disc1 = new CompactDisc();
		CompactDisc disc[]= new CompactDisc[num];
		for(int i=0;i<disc.length;i++)
		{
			disc[i] = new CompactDisc();
			System.out.print("Enter CD id ");
			disc[i].setId(sc.nextInt());
			System.out.print("Enter CD type ");
			disc[i].setType(sc.next());
			System.out.print("Enter CD Artist ");
			disc[i].setArtist(sc.next());
			System.out.print("Enter price ");
			disc[i].setPrice(sc.nextDouble());
			System.out.print("Enter discount ");
			disc[i].setDiscount(sc.nextFloat());
		}
		
		System.out.print("How many customer ");
		num1 = sc.nextInt();
		Order od[] = new Order[num1];
		for(int i=0;i<od.length;i++)
		{	
			od[i] = new Order();
			od[i].setOrderId();
			od[i].setCustId();
			System.out.print("Enter customer Name ");
			od[i].setCustName(sc.next());
			System.out.print("How many of types Cd you want ");
			od[i].setQuantType(sc.nextInt());
			for(int j=0;j<od[i].getQantype();j++)
			{
				System.out.println("Enter Id of CD you want ");
				idCheck= sc.nextInt();
				if(od[i].check(idCheck, disc))
				{
					System.out.println("How many cd you want of id "+idCheck);
					od[i].setNumberOfCD(sc.nextInt());
					od[i].setPayableAmt(idCheck, disc);
				}
				else
				{
					System.out.println("Sorry the cd you are looking is not available try different CD ");
					od[i].setNumberOfCD(0);
				}
			}
		}
		for(int i=0;i<disc.length;i++)
		{
			disc[i].displayDisc();
		}
		for(int i=0;i<od.length;i++)
		{
			od[i].displayOrder();
		}

		do
		{
			System.out.println("+++++++++++++++++++++++++++");
			System.out.println("Press 1 for Price Range  ");
			System.out.println("Press 2 for checking availability of Cd ");
			System.out.println("Press 3 Highest/Lowest Discount on CD ");
			System.out.println("+++++++++++++++++++++++++++");
			number = sc.nextInt();
			switch (number) {
				case 1:
					System.out.println("Enter price range of Cd ");
					price1 = sc.nextDouble();
					price2 = sc.nextDouble();
					disc1.range(price1, price2, disc);
					break;
				case 2:
					System.out.print("Enter id of the cd ");
					idCheck = sc.nextInt();
					disc1.checkID(idCheck, disc);
				case 3:
					disc1.highDiscount(disc);
					disc1.lowDiscount(disc);
			}
			System.out.print("Want to check again press y ");
			ch = sc.next();
		}
		while(ch == "y" );	
	}
}
