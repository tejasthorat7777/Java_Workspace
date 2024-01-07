public class Customer
{
	private String customer_name,customer_city,customer_age;
	private int ticket_number;
	private static int ticket_counter = 102004;
	private Stadium stadium;
	public Customer()
	{
		this.customer_name = "Tejas Thorat";
		this.customer_city = "Nashik";
		this.customer_age = "22";
		this.ticket_number = 102004;
	}
	public void setTicket_number()
	{
		this.ticket_number = ticket_counter++;
	}
	public void setCustomer_name(String customer_name)
	{
		this.customer_name = customer_name;
	}
	public void setCustomer_city(String customer_city)
	{
		this.customer_city = customer_city;
	}
	public void setCustomer_age(String customer_age)
	{
		this.customer_age = customer_age;
	}
	public void setStadium(Stadium stadium)
	{	
		this.stadium = stadium;
	}

	public void setSeat_number_cust()
	{
		this.stadium.setSeat_number();
	}

	public void setTicket_price_cust()
	{
		this.stadium.setTicket_price(this.stadium.getSeat_number_cust());
	}

	public int getTicket_number(){return this.ticket_number;}
	public String getCustomer_name(){return this.customer_name;}
	public String getCustomer_city(){return this.customer_city;}
	public String getCustomer_age(){return this.customer_age;}
	public Stadium getStadium(){return this.stadium;}

	public void display(Customer[] c)
	{
		for(int i=0;i<c.length;i++)
		{
			System.out.print("Ticket number: "+c[i].getTicket_number());
			System.out.print("\tName: "+c[i].getCustomer_name());
			System.out.print("\tCustomer_city: "+c[i].getCustomer_city());
			System.out.println("\tCustomer_age: "+c[i].getCustomer_age());
			System.out.println("Stadium Details: ");
			c[i].getStadium().display();
		}
	}

	public Stadium valid(Stadium[] s, String str)
	{	
		for(int i=0;i<s.length;i++)
		{
			if(str.equals(s[i].getVenue()))
			{
				return s[i];
			}
		}
		return null;
	}
}