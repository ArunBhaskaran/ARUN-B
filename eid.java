package progr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class eid {
	static int re=0;
	String Name;
	String Address;
	String Cont;
	String Eid;
	String Proof;
	String Proofid;
	int arr[]=new int[25];
	void reg(String Name,String Address,String Cont,String Eid,String Proof,String Proofid)throws IOException
	{
		for(int i=0;i<25;i++)
		{
		
			arr[i]=0;
		}
		String c ="";
		this.Name=Name;
		this.Address=Address;
		this.Cont=Cont;
		this.Eid=Eid;
		this.Proof=Proof;
		this.Proofid=Proofid;
		System.out.println("Registration");
		do
		{
			int a=0;
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Name:-");
		
		Name=in.readLine();
		
		System.out.println("Enter the Address:-");
		Address=in.readLine();
		System.out.println("Contact No:-");
		Cont=in.readLine();
		System.out.println(" Email ID:-");
		Eid=in.readLine();
		System.out.println("Proof type:-");
		Proof=in.readLine();
		System.out.println("Proof ID:-");
		Proofid=in.readLine();
		
		System.out.println("\n Thank you for registering.your id is"+ ++re);
		
		
		System.out.println("Do you want to continue registering(y/n)");
		c=in.readLine();
		}
		
		while(c.equals("y"));
			arr[re-1]=1;
			
	System.out.println("Do you want update the email id?(yes/no)");
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	c=in.readLine();
	 if(c.equals("yes"))
	 {
		 eid1 obj=new eid1();
		 Eid=obj.change();
	 }
	System.out.println("Your details are Follows");
	System.out.println("Name :-"+Name);
	System.out.println("Address:-"+Address);
	System.out.println("Cont:-"+Cont);
	System.out.println("Eid:-"+Eid);
	System.out.println("Proof:-"+Proof);
	System.out.println("Proofid:-"+Proofid);
	}
	public static void main(String[] args) throws IOException
	{
		eid d=new eid();
		String Name=" ";
		String Address=" ";
		String Cont=" ";
		String Eid=" ";
		String Proof=" ";
		String Proofid=" ";
		String c;
		d.reg(Name ,Address,Cont,Eid,Proof,Proofid);

	}		
		
	}

