import java.util.*;


class FindLargest{

    public static void main( String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Three Values to find The Largest one");

        int arr[]=new int[3];
        for(int i=0;i< 3;i++){
            arr[i]= sc.nextInt();
          }
          
           if(arr[0]>arr[1] && arr[0]> arr[2]){
            System.out.println("Largest No is"+arr[0]);    
        }
        else if(arr[1]>arr[2]){
            System.out.println("Largest no  is "+arr[1]);
        }
        else{
            System.out.println("largest no is "+ arr[2]);
        }
            
            
          
        
    }
}