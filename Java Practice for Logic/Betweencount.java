import java.util.*;
class Betweencount{
public static void main(String args[]){
	int l,r,k,count=0;
	System.out.println("Enter Three values");
	Scanner sc=new Scanner(System.in);
	l=sc.nextInt();
	r=sc.nextInt();
	k=sc.nextInt();
	for(int i=l;i<=r;i++){
			if(i%k==0){
				count++;
				}
		}
	System.out.println(count);
	}	

}