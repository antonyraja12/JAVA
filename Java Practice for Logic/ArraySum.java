import java.util.*;


class ArraySum{
	public static void main(String args[]){
	int c=0;
	System.out.println("Enter the length of the Array ");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();		
	int b[]=new int[x];
	for(int i=0;i<x;i++){
		b[i]=sc.nextInt();
       
		}
	for(int i=0;i<x;i++){
		c=b[i]%10;
		
		}
		if (c%10==0){
		 System.out.println("YES");
			}
		else{
			System.out.println("NO");	
		}
	
}
}