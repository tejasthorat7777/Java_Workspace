package cdpkg;
import java.util.Scanner;
public class CompactDisc
{	
	Scanner sc = new Scanner(System.in);
	private int id;
	private String type,artist;
	private double price;
	private float discount;

	public CompactDisc(){}

	public void setId(int id)
	{
		this.id = id;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public void setArtist(String artist)
	{
		this.artist= artist;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setDiscount(float discount)
	{
		this.discount= discount;
	}

	public int getId(){return this.id;}
	public String getType(){return this.type;}
	public String getArtist(){return  this.artist;}
	public double getPrice(){return this.price;}
	public double getDiscount(){return this.discount;}

	public void displayDisc()
	{	
		System.out.println("+++ CD Details +++");
		System.out.print("CD Id id "+getId());
		System.out.print("	CD type "+getType());
		System.out.print("	Artist "+getArtist());
		System.out.print("	CD Price "+getPrice());
		System.out.println("	Discount "+getDiscount());
	}

	public void range(double price1 , double price2, CompactDisc disc[])
	{
		for(int i=0;i<disc.length;i++)
		{
			if(disc[i].price>=price1 && disc[i].price<=price2)
			{
				System.out.print("CD id is "+disc[i].id);
				System.out.print("	CD type is "+disc[i].type);
				System.out.print("	CD Artist is "+disc[i].artist);
				System.out.print("	CD price is "+disc[i].price);
				System.out.println("	CD discount is "+disc[i].discount);
			}
		}
	}

	public void checkID(int id, CompactDisc disc[])
	{	
		boolean flag = false;
		for(int i=0;i<disc.length;i++)
		{
			if(disc[i].getId() == id)
			{
				flag = true;
			}
		}
		if(flag)
		{
			System.out.print("It is available ");
		}
		else
		{
			System.out.print("It is not available try next time ");
		}
	}

	public void highDiscount(CompactDisc disc[])
	{	
		double high = disc[0].discount;
		for(int i=1;i<disc.length-1;i++)
		{
			if(high<disc[i].discount)
			{
				high = disc[i].discount;
			}
		}
		for(int i=0;i<disc.length;i++)
		{
			if(high == disc[i].discount)
			{	System.out.println("+++ Highest Discount +++");
				System.out.print("CD id is "+disc[i].id);
				System.out.print("	CD type is "+disc[i].type);
				System.out.print("	CD Artist is "+disc[i].artist);
				System.out.print("	CD price is "+disc[i].price);
				System.out.println("	CD discount is "+disc[i].discount);
			}
		}
	}

	public void lowDiscount(CompactDisc disc[])
	{	
		double low = disc[0].discount;
		for(int i=1;i<disc.length-1;i++)
		{
			if(low>disc[i].discount)
			{
				low = disc[i].discount;
			}
		}
		for(int i=0;i<disc.length;i++)
		{
			if(low == disc[i].discount)
			{	System.out.println("+++ Lowest Discount +++");
				System.out.print("CD id is "+disc[i].id);
				System.out.print("	CD type is "+disc[i].type);
				System.out.print("	CD Artist is "+disc[i].artist);
				System.out.print("	CD price is "+disc[i].price);
				System.out.println("	CD discount is "+disc[i].discount);
			}
		}
	}

}
