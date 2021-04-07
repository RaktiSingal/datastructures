package datastructures;
import java.util.*;
public class twodarray {
	static int rows1;
	 static int cols1;
	static int rows2,cols2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			  System.out.println("Enter rows and columns:");
			  rows1=sc.nextInt();
			  cols1=sc.nextInt();
			  System.out.println("Enter 2D Array in matrix order:");
			  int a[][]=new int[rows1][cols1];
			  for(int i=0;i<rows1;i++)
			  {
				  for(int j=0;j<cols1;j++)
				  {
					  a[i][j]=sc.nextInt();
				  }
			  }
                    System.out.println("Select option You want to perform");
                    System.out.println("1. Addition of 2-D Matrix ");
                    System.out.println("2. Multiplication of 2-D matrix");
                    System.out.println("3. Transponse");
                    System.out.println("4. Sum of Upper Triangular Matrix");
                    System.out.println("5. Sum of lower Triangular Matrix");
                    System.out.println("6. Sum of all rows");
                    System.out.println("7. Sum of all columns");
                    System.out.println("8.Check identity matrix or not");
               System.out.println("Enter your Choice");
               int choice=sc.nextInt();
                        
                      if(choice==1)
                      {

            			  System.out.println("Enter rows and columns:");
            			  rows2=sc.nextInt();
            			  cols2=sc.nextInt();
                    	  System.out.println("Enter 2D Array in matrix order to add:");
            			  int b[][]=new int[rows2][cols2];
            			  for(int i=0;i<rows2;i++)
            			  {
            				  for(int j=0;j<cols2;j++)
            				  {
            					  b[i][j]=sc.nextInt();
            				  }
            			  }
            			  
            			  if(rows1==rows2 && cols2==cols2)
            			  {
            				  addmatrix(a,b);
            			  }
            			  else
            			  {
            				  System.out.println("Cannot add ,not a square matrix");
            			  }
                      }
                      if(choice==2)
                      {
                    	  System.out.println("Enter rows and columns for second matrix:");
            			  rows2=sc.nextInt();
            			  cols2=sc.nextInt();
                    	  System.out.println("Enter 2D Array in matrix order to multiply:");
            			  int b[][]=new int[rows2][cols2];
            			  for(int i=0;i<rows2;i++)
            			  {
            				  for(int j=0;j<cols2;j++)
            				  {
            					  b[i][j]=sc.nextInt();
            				  }
            			  }
            			  
                    	  if(rows1==cols2)
                    	 multiplication(a,b);
                    	  else
                    		  System.out.println("Cannot multiply");
                      }
                      if(choice==3)
                      {
                    	  transpose(a);
                      }
                      if(choice==4)
                      {
                    	  uppertriangular(a);
                      }
                      if(choice==5)
                      {
                    	  lowertriangular(a);
                      }
                      if(choice==6)
                      {
                    	  sumofrows(a);
                      }
                      if(choice==7)
                      {
                    	  sumofcol(a);
                      }
                      if(choice==8)
                      {
                    	  identity(a);
                      }
              		System.out.println("Do want to continue with operations. Press 0 to end and 1 to continue");
              		int terminate=sc.nextInt();
              		if(terminate==0)
              			return;
              		if(terminate==1)
              			continue;
                    	  
  
	}
	}
		public static void addmatrix(int a[][],int b[][])
		{
		int c[][]=new int[rows1][cols1];	
			for(int i=0;i<rows1;i++)
			{
				for(int j=0;j<cols1;j++)
					c[i][j]=a[i][j]+b[i][j];
			}
			for(int i=0;i<rows1;i++)
			{
				for(int j=0;j<cols1;j++)
					System.out.print(c[i][j]+" ");
				System.out.println();
			}
		}
		public static void multiplication(int a[][],int b[][])
		{
			
		}
		public static void transpose(int a[][])
		{
			
		}
		public static void uppertriangular(int a[][])
		{
			
		}
		public static void lowertriangular(int a[][])
		{
			
		}
		public static void sumofrows(int a[][])
		{
			int sum=0;
			for(int i=0;i<rows1;i++)
			{
				for(int j=0;j<cols1;j++)
					sum=sum+a[i][j];
			}
			System.out.println("Sum of all rows: "+sum);
		}
		public static void sumofcol(int a[][])
		{
			int sum=0;
			for(int i=0;i<cols1;i++)
			{
				for(int j=0;j<rows1;j++)
					sum=sum+a[i][j];
			}
			System.out.println("Sum of all columns: "+sum);
		}
		public static void identity(int a[][])
		{
			
		}
	

}
