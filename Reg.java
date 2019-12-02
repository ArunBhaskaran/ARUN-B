import java.util.Scanner;
import java.io.IOException;
public class Reg {
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
	for(int i=0;i<=25;i++)
	{
		arr[i]=0;
	}
	String c = null;
	System.out.println("Registration");
	do
	{
		int a=0;
	System.out.println("Enter the Name:-");
	System.out.println("Enter the Address:-");
	System.out.println("Enther the Contact No:-");
	
	}
	while(c.equals("no"));
	System.out.println("Thank you for registering.your id is"+ ++re);
	arr[re-1]=1;
	
	{
		
	}
		
	
	
}
}
