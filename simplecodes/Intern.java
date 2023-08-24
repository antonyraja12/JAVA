import java.util.*;
class Intern{

	public static void temprature(){ 
	System.out.println("Enter Temprature in celcius");
	Scanner sc=new Scanner(System.in);
	float temp=sc.nextInt();
	float fah=(temp*9/5)+32;
	
	System.out.println(fah);
	}
	public static void palindrome(){
	System.out.println("Enter a Word or String to check if it is Palindrome or not ");
	Scanner sc =new Scanner(System.in);
	String st=sc.nextLine();
	int i=0;
	int j=st.length()-1;
	for(i=0;i<j-1;i++){
		
			if(st.charAt(i++)==st.charAt(j--)){
				System.out.println("Entered String is Palindrome");
			}
			else{
			System.out.println("Entered String is not a Palindrome");
			}
		}		
	    }
	public static void main(String args[]){
//	temprature();
	palindrome();
	
}
}