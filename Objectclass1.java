package sampleswing;

public class Objectclass1 {
	static int lastroll=100;
	int rollno;
	Objectclass1()
	{
		rollno=lastroll;
		lastroll++;
	}
		public int hashCode()
		{
		return rollno;
		}
		public static void main(String args[])
		{
			Objectclass1 s=new Objectclass1();
			System.out.println("\t"+s );
			System.out.println("\t" +s.toString());
			Object ob=new String ("chekkuzz");
			Class c=ob.getClass();
			System.out.println("\tClass of object: "+c.getName());
			s=null;
			System.gc();
			
		}
		protected void finalize()
		{
			System.out.println("\t finalized method called");
		}
	}


