package battleship;

import java.util.*;

class cB{
	int arr[];
	String k;
	cB()
	{k="Playing!";
		arr=new int[7];
	for(int i=0;i<7;i++)
	{arr[i]=0;
	}
	int x=(int)(Math.random()*5);
			arr[x]=1;
			arr[x+1]=1;
			arr[x+2]=1;
	//System.out.println(x);
	}
	cB checkhit(int pos)
	{if(arr[pos]!=2 && arr[pos]!=-1)
		{if(arr[pos]==0)
		{System.out.println("Miss!");
		arr[pos]=-1;
		}
		else if(arr[pos]==1)
		{System.out.println("Hit!");
		arr[pos]=2;
		}
		}
		else
			{System.out.println("Already Used");
			}
	k=this.checkfinal();
	if(k=="Won!")
	{System.out.println("You have won!");
	}
	return this;
	}
	void display()
	{for(int i=0;i<7;i++)
	{System.out.print(arr[i]+" ");
	}
	System.out.println();
	}
	String checkfinal()
	{
	int i;	
	for(i=0;i<7;i++)
	{if(arr[i]==1)
		break;
	}
	if(i==7)
	{this.k="Won!";}
	return this.k;
	}

}

public class board {
	public static void main(String[] args)
	{cB B=new cB();
	/*B.checkhit(3);	
	B.checkhit(2);
	B.checkhit(4);
	B.checkhit(5);
	*/
	Scanner input = new Scanner(System.in);
	while(B.k!="Won!")
	{int number = input.nextInt();
	System.out.println(number);
	B.checkhit(number);
	}
	B.display();
	}
}
