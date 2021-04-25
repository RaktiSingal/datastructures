package datastructures;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergesort m=new mergesort();
int a[]= {90,8,56,4,5};
for(int i=0;i<5;i++)
	System.out.print(a[i]+" ");
m.sort(a,0,4);
System.out.println();
for(int i=0;i<5;i++)
	System.out.print(a[i]+" ");
	}
void sort(int a[],int l,int r)
{
	if(l<r)
	{
		int m=l+(r-l)/2;
		sort(a,l,m);
		sort(a,m+1,r);
		merge(a,l,m,r);
	}
}
void merge(int a[],int l,int m,int r)
{
	int n1=m-l+1;
	int n2=r-m;
	int L[]=new int[n1];
	int R[]=new int[n2];
	
	for(int i=0;i<n1;++i)
	{
		L[i]=a[l+i];
	}
	for(int j=0;j<n2;j++)
		R[j]=a[m+j+1];
	
	int i=0,j=0,k=l;
	while(i<n1 && j<n2)
	{
		if(L[i]<=R[j])
		{
			a[k]=L[i];
			i++;
		}
		else
		{
			a[k]=R[j];
			j++;
		}
		k++;
	}
	while(i<n1)
	{
		a[k]=L[i];
		i++;
		k++;
	}
	while(j<n2)
	{
		a[k]=R[j];
		j++;
		k++;
	}
}
}
