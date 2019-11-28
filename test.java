package sampleswing;
import java.io.IOException;
import java.util.Scanner;
public class test {
private static Scanner sc;

public static void main(String args[]) throws IOException
{
String ac="null";
String cot="null";
String cable="null";
String wifi="null";
String laundry="null";
while(true)
{
    System.out.println("Please Select Choice");
System.out.println("1 ->Book 2->Status 3->Exit");
sc = new Scanner(System.in);
int a=sc.nextInt();
Book obj=new Book();
switch(a)
{
case 1:
obj.book(ac,cot,cable,wifi,laundry);
break;
case 2:
obj.reserve();
break;

case 3:
obj.exit();
break;
default:
System.out.println("Please enter valid option");
}
}

}
}
