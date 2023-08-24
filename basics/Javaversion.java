import java.util.*;
class Javaversion{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Version:"+System.getProperty("java.version"));
System.out.println("Vendor:"+System.getProperty("java.vendor"));
System.out.println("Path"+System.getProperty("java.home"));


}
}