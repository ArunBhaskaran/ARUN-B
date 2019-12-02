package main2;
public class booking{
	String ac,cot,cable,wifi,laundry;
	int bid,date,cuid;
	int book(String ac,String cot,String cable,String wifi,String laundry,int date,int bid,int cuid)
	{
		float tot=0.0f;
		
		if(cot.contentEquals("Double"))
		{
			tot=tot+350;
			this.cot="Double cot";
		}
		else
			this.cot="Single cot";
		
		if(ac.contentEquals("AC"))
		{
			tot=tot+1000;
			this.ac="AC Room";
		}
		else if(ac.contentEquals("nAC"))
		{
			tot=tot+750;
			this.ac="Non-AC Room";
		}
		if(cable.contentEquals("C"))
		{
			tot=tot+50;
			this.cable="Cable Connection Enabled";
		}
		else
			this.cable="Cable Connection Disabled";
		if(wifi.contentEquals("W"))
		{
			tot=tot+200;
			this.wifi="WiFi Connection Enabled";
		}
		else
			this.wifi="WiFi Connection Disabled";
		if(laundry.contentEquals("C"))
		{
			tot=tot+100;
			this.laundry="With Laundry Service";
		}
		else
			this.laundry="With out Laundry Service";
		this.date=date;
		this.bid=bid;
		this.cuid=cuid;
		System.out.println("The total charge is Rs."+tot+"\n");	
		System.out.println("Booking is done by the customer :"+this.cuid);
		System.out.print(this.cot+" ");
		System.out.println(this.ac);
		System.out.println(this.cable);
		System.out.println(this.wifi);
		System.out.println(this.laundry);
		System.out.println("Your Room Number is :"+this.bid);
		System.out.println("ON DATE :"+this.date);

		return this.bid;
		
}
	void view(int d1,int d2)
	{
	System.out.println(this.bid+"\t\t"+this.date+"\t\t"+this.cuid);
	}
	
		
	}