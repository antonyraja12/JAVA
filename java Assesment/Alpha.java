import java.util.*;
import java.lang.*;
class Alpha{
	public static void main(String args[]){
		String str;
		System.out.println("enter the word");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String[] sep=str.split("");
		System.out.println("no of characters"+sep.length);
		for(int i=0;i<sep.length;i++){
		
		if(sep[i].equalsIgnoreCase("a")||(sep[i].equalsIgnoreCase("e"))||(sep[i].equalsIgnoreCase("i"))||(sep[i].equalsIgnoreCase("o"))||(sep[i].equalsIgnoreCase("u"))){
			System.out.println("Entered letter is vowel   "+sep[i]);
			

			}
		else{
			System.out.println("consonents"+sep[i]);		
			}

		}
	}
}