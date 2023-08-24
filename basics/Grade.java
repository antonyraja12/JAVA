import java.util.*;
class Grade
{
public static void main(String[] args)
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Mark in pecentage");
a=sc.nextInt();

switch(a){
	case 10:
	System.out.println("Distinct");
	break;
        case 5:
	System.out.println("Second Class");
	break;

	default:
	System.out.println("Fail") ;
}
}
}