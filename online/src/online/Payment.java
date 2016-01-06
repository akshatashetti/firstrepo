package online;

public class Payment {

	
	
	
	Item  i=new Item("moto g2");
	
	String name=i.getName();
	//i.setPrice(1000.00);
	//i.setPrice(100);
	double price=i.getPrice();
	public void payDebit()
	{
		System.out.println("Item is "+name);
		//System.out.println("Item is"+price);
		System.out.println("give debit details");
		System.out.println("take debit details");
	}
	public void payCredit()
	{
		System.out.println("give credit details");
		System.out.println("take credit details");
	}
	public void payNet()
	{
		System.out.println("give netbank details");
		System.out.println("take netbank details");
	}
	public void payCash()
	{
		System.out.println("give cash details");
		System.out.println("take cash details");
	}

}
