import java.util.*;
class ArrayFor
{
public static void main(String[] args)
{
int x[]=new int[5];
int c = 0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 values");
for(int i=0;i<5;i++)
{
x[i]=sc.nextInt();
}
for(int i=0;i<5;i++)
{
 System.out.println("Values:"+x[i]);
}
for(int i=0;i<5;i++)
{
c+=x[i];
}
System.out.println("Addition of Five numbers: " +c);
}
}