package main2;
public class register {
	int id;
	String name,address,mob,pt,pno;
	int registration(int id,String name,String address,String mob,String pt,String pno)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.mob=mob;
		this.pt=pt;
		this.pno=pno;
		return this.id;
	}
	void display()
	{
		System.out.println("Your details are as follows\n.Name:"+this.name
				+"\n.Address: "+this.address+"\n.Contact Number: "+this.mob
				+"\n.Proof type: "+this.pt+"\n.Proof id: "+this.pno
				+"\nYour Registration ID is: "+this.id+"\n-------------------------------------");
	}

	/*void viewcus()
	{
	System.out.print(this.name+"\t"+this.mob);
	}*/

}