package simplecodes;

import java.util.Scanner;

public class Palindrom {
    public static boolean palin(int sum){
        String str=String.valueOf(sum);
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i++)!=str.charAt(j--)){
                return false;    
            }
            
        }
        return true;
       
    }
    public static boolean palin(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if (str.charAt(i++) != str.charAt(j--)){
            return false;
        }
        // System.out.println(j--);
    }
    return true;
    }
    public static void main(String args[]){
        System.out.println("Enter value  to check palindrome");
        Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        String st=sc.nextLine();
        System.out.println(palin(st));
    }
    
}
