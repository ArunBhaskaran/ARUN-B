package main2;

public class cust
 {
int id;
String name,address,mob,mail,prooft,proofno;
void register(int id,String name,String address,String mob,String mail,String prooft,String proofno)
{
this.id=id;
this.name=name;
this.address=address;
this.mob=mob;
this.mail=mail;
this.prooft=prooft;
this.proofno=proofno;
}

void display()
{

	System.out.println(id+"\t\t"+name);
}
 }

