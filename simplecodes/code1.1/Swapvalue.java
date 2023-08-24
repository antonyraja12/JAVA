public   class  Swapvalue {
    int x,y;
    public static  void Swap(int a,int b){

        int x=a;
        int y=b;
        // x=a+b;
        x+=y;
        y=x-y;
        x=x-y;
        System.out.println(" value of X="+x +" value Of Y="+y);
    }
    public static void main(String args[]){
        
        Swap(12,24);
    }
    
}
