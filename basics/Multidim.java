import java.util.*;
class Multidim{
public static void main(String[]args)
{
int a,b,c;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array");
a=sc.nextInt();
b=sc.nextInt();
int z[][]=new int[a][b];
for(int i=0;i<a;i++)
	{
	for(int j=0;j<b;j++)
		{
		System.out.println("Enter the array value");
		 z[i][j] =sc.nextInt(); 
			
		}	
	}

for(int i=0;i<a;i++)
	{
	for(int j=0;j<b;j++)
		{
		System.out.print(z[i][j]);
		System.out.println();
			
		}
	}

2


}}