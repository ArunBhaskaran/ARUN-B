package progr;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class eid1
{
	
 public String change() throws IOException
 {
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 String nemail;
System.out.println("Update email");
System.out.println("Enter the new Email ID");
 nemail=in.readLine();
 return nemail;
 }
}
