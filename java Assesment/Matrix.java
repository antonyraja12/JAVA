import java.util.*;
class Matrix{
public static void main(String args[]){
	int mat[][];
	mat =new int [5][3];
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the values");	
		mat1=mat.length-1;

		for(int i=0; i<5; i++) 
			{
     			  for(int j=0; j<3; j++)
				 {
       				 mat[i][j] = sc.nextInt();
   				 }
    
			}
			
		System.out.println(Arrays.deepToString(mat));      



}
}
