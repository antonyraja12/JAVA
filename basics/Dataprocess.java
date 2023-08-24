import java.util.*;
class Dataprocess
{
public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	String a="antony",b="arun",c="abishek",d="manoj" ,e="Dhanvaththri";
	System.out.println("Data Fcteching using else if condition");
	System.out.println("Enter you Batch");
	int s=12,p; 
	p=sc.nextInt();
        System.out.println("Enter name to get the datailes of the student of RP12");
	String name = sc.next();
if(s==p)  
{
	System.out.println("bacth 12 ");
        
        if(name.equalsIgnoreCase(a))
		{
		 System.out.println("Antony Raja");
                 System.out.println("RSP12001");	
		}
	else if(name.equals(b))
		{
		 System.out.println("arun");
                 System.out.println("RSP12002");	
		}
	else if(name.equals(c))
		{
		 System.out.println("abishek");
                 System.out.println("RSP12003");	
		}
	else if(name.equals(d))
		{
		 System.out.println("Manoj");
                 System.out.println("RSP12004");	
		}
	else if(name.equals(e))
		{
		 System.out.println("Dhanvanthri");
                 System.out.println("RSP12005");	
		}
}
	else
	{
	 System.out.println("entered name is  not found in batch 12");
        }
}
}