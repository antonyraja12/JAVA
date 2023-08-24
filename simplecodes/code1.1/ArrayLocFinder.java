public class ArrayLocFinder {
   
   public static int finder(int arr[],int key){
    for (int i=0;i<arr.length;i++){
       if(arr[i]==(key)){
        return i;
       }
    }
    return 0;
    }
    public static void main(String [] args){

    int arr1[]={12,23,34,45,56,67,78,89};
    int arr2[]={56,45,34,23,12,67,78,89};
    int arr3[]={45,78,78,89,56,56};
    int val=56;
    System.out.println(val+"is found in the index of  "+finder(arr1,val)+"  in Array1");
    System.out.println(val+"is found in the index of  "+finder(arr2,val)+"  in Array2");
    System.out.println(val+"is found in the index of  "+finder(arr3,val)+"  in Array3");
    }
}
