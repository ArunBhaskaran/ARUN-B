package main2;
import java.io.IOException;
import java.util.*;
public class regid {

public static void main(String args[]) throws IOException {
 int reg=1;

	cust[] arr=new cust[10];
	int i=0;
	
String name;
String address;
String contactno;
String emailid;
String proof;
String proofid;
String d;
String e;
int ch;
Scanner s=new Scanner(System.in); 
do
{
System.out.println("SELECT YOUR OPTION");
System.out.println("\n1.REGISTRATION\n2.VIEW ALL BOOKING");
ch=s.nextInt();
switch(ch) {
case 1:
do
{

System.out.println("REGISTRATION");
System.out.print("Enter your name:");
    name=s.next();
    
System.out.print("Enter your address:");
address=s.next();
System.out.print("Enter your Contact Number:");
   contactno=s.next();
System.out.print("Enter your E-Mail ID:");
emailid=s.next();
System.out.print("Enter your proof type:");
proof=s.next();
System.out.print("Enter your proof ID:");
proofid=s.next();
arr[i]=new cust();
arr[i].register(reg,name,address,contactno,emailid,proof,proofid);
System.out.println("Thank you for registering"+"Your id is :"+reg);

System.out.println("Do you want to Continue Registration(yes/no)");
d=s.next();
reg++;
i++;
}
while(d.equals("yes"));
break;
case 2: 
	System.out.println("Customers list\nThe registered customers are");
	System.out.println("Customer ID\tCustomer name");
	for(int j=0;j<i;j++)
	{
	arr[j].display();
	}

break;
default:
break;
}
System.out.println("Do you want to Continue(yes/no)");
e=s.next();
}while(e.equals("yes"));
System.out.println("Thank you");
}
}
