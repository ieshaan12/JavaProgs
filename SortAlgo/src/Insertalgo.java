class InsertSort{
	void sort(int a[])
	{for(int i=1;i<a.length;i++)
		{int key=a[i];
		int j=i-1;
		while(j>=0 && a[j]>key)
			{a[j+1]=a[j];
			j=j-1;}
		a[j+1]=key;
		}
	for(int i:a)
	{System.out.print(i+" ");
	}
	System.out.println("");
	}
}
public class Insertalgo {
	public static void main(String[] args)
	{int arr[]= {10,8,2,3,4,1,7,6,5,9};
	InsertSort s=new InsertSort();
		for(int i:arr)
		{System.out.print(i+" ");
		}
		System.out.println("");
		s.sort(arr);
	}

}
