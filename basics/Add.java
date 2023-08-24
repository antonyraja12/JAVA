import java.util.Scanner;

class Add{
      static   int x,y;
      
    public static  int sum(int a,int b){ 

        int sum=x+y;

System.out.println("Addition values:"+sum);
         return sum;
    }
    Add(int a,int b){
        System.out.println("Constructor invoked");
        x=a;
        y=b;

    }



public static void main(String args[])
{
    System.out.println("Enter 2 numbers ");
    Scanner sc=new Scanner(System.in);
    
    Add obj=new Add(10,6);
    sum(x,y);

// sum(5,6);

}
}
