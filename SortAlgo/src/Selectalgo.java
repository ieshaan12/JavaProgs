class SelectionSort
{void sort(int a[])
{for(int i=0;i<a.length;i++)
{int min=i;	
	for(int j=i;j<a.length;j++)
	{if(a[min]>a[j])
		min=j;
	}
	int t=a[min];
	a[min]=a[i];
	a[i]=t;
}
for(int i:a)
{System.out.print(i+" ");
}
}
}

public class Selectalgo {
	
	
	public static void main(String[] args)
	{int arr[]= {10,8,2,3,4,1,7,6,5,9};
	SelectionSort s=new SelectionSort();
	for(int i:arr)
	{System.out.print(i+" ");
	}
	System.out.println("");
	s.sort(arr);
	}

}
