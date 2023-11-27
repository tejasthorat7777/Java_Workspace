package orderpkg;
import cdpkg.*;
public class Order
{	

	private int orderId,custId;
	private String custName;
	private static int orderID=12345;
	private static int custID=987654;
	private int quantype;
	private double payableAmt[];
	private int Quantity[];
	private int type[];
	int indextype = 0;
	int payableIndex = 0; 
	int payableIndexRet =0; 
	int index = 0;
	int ret = 0;

	CompactDisc disc1 = new CompactDisc();

	public void setOrderId()
	{
		this.orderId=orderID+1;
		orderID++;
	}
	public void setCustId()
	{
		this.custId=custID+1;
		custID++;
	}
	public void setCustName(String custName)
	{
		this.custName=custName;
	}
	public void setQuantType(int quantype)
	{
		this.quantype=quantype;
		Quantity = new int[quantype];
		type = new int[quantype];
		payableAmt = new double[quantype];
	}
	public void setNumberOfCD(int QuantCD)
	{	
		Quantity[index]= QuantCD;
		index++;
	}

	public int getNumberOfCd()
	{
		return Quantity[ret++];
	}

	public int getOrderId(){return this.orderId;}
	public int getCustId(){return this.custId;}
	public String getCustName(){return this.custName;}
	public int getQantype(){return this.quantype;}

	public void setPayableAmt(int id, CompactDisc disc[])
	{	
		for(int i=0;i<disc.length;i++)
		{
			if(disc[i].getId() == id)
			{
				payableAmt[payableIndex] = disc[i].getPrice()*Quantity[payableIndex] - disc[i].getDiscount();
				payableIndex++;
			}
		}
	}
	
	public double getPayableAmt()
	{
		return payableAmt[payableIndexRet++];
	}
	
	
	public boolean check(int id, CompactDisc disc[])
	{	
		type[indextype] = id;
		indextype++;
		for(int i=0;i<disc.length;i++)
		{
			if(disc[i].getId() == id)
			{
				return true;
			}
		}
		return false;
	}

	public void displayOrder()
	{	
		System.out.println("+++ Order Details +++");
		System.out.print("OrderId "+getOrderId());
		System.out.print("	CustId "+getCustId());
		System.out.print("	CustName "+getCustName());
		System.out.println("	No. of types of CD you want "+getQantype());
		for(int j=0;j<getQantype();j++)
		{
			System.out.print("Quantity of CD "+ type[j] +" is "+getNumberOfCd());
			System.out.println("	payableAmt for Cd "+ type[j] +" is "+ getPayableAmt());
		}
	}
}
