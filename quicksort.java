package datastructures;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {40,60,80,1,2};
         for(int i=0;i<5;i++)
        		System.out.print(a[i]+" ");
         sort(a,0,4);
         System.out.println();
         for(int i=0;i<5;i++)
        		System.out.print(a[i]+" ");
	}
	static void sort(int a[],int l,int h)
	{
		if(l<h)
		{
			int p=partition(a,l,h);
			sort(a,l,p-1);
			sort(a,p+1,h);
		}
	}
	static int partition(int a[],int l,int h)
	{
		int p=a[h];
		int i=l-1;
		
		for(int j=l;j<=h;j++)
		{
			if(a[j]<p)
			{
				i++;
				swap(a,i,j);
			}
		}
		swap(a,i+1,h);
		return i+1;
	}
	static void swap(int a[],int i,int j)
	{
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

}
