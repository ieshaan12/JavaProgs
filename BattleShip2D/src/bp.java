import java.util.*;

//import java.lang.*;
class cB{
	int arr[][];
	private String k;
	List<Integer> t;
	//Ship a[];
	String getString()
	{return this.k;
	}
	cB()
	{k="Playing!";
		arr=new int[7][7];
	for(int i=0;i<7;i++)
		{for(int j=0;j<7;j++)
			{arr[i][j]=0;
			}
		}
	t=new ArrayList<>();
	for(int m=0;m<49;m++)
	{t.add(m);}
	for(int l=0;l<3;)		
	{int d=(int)(Math.random()*2);
	int x=(int)(Math.random()*5);
	int y=(int)(Math.random()*5);
	//System.out.println(x+" "+y);
	
	if(d==1 && t.contains(x*7+y) && t.contains(x*7+y+7) && t.contains(x*7+y+14))
	{
	this.arr[x][y]=1;
	this.arr[x+1][y]=1;
	this.arr[x+2][y]=1;
	t.remove(new Integer(x*7+y));
	t.remove(new Integer(x*7+y+7));
	t.remove(new Integer(x*7+y+14));
	l++;
	System.out.println((x*7+y)+" "+(x*7+y+7)+" "+(x*7+y+14));
	//printlist();
	}
	else if(d==0 && t.contains(x*7+y) && t.contains(x*7+y+1) && t.contains(x*7+y+2))
	{
	 this.arr[x][y]=1;
	 this.arr[x][y+1]=1;
	 this.arr[x][y+2]=1;
	t.remove(new Integer(x*7+y));
	t.remove(new Integer(x*7+y+1));
	t.remove(new Integer(x*7+y+2));
	System.out.println((x*7+y)+" "+(x*7+y+1)+" "+(x*7+y+2));
	l++;
	//printlist();
	}
	}
	
	}
	void display()
	{for(int i=0;i<7;i++)
	{for(int j=0;j<7;j++)
		{System.out.print(arr[i][j]+" ");}
	System.out.println();
	}
	}
	void countOne()
	{int count=0;
		for(int i=0;i<7;i++)
			{for(int j=0;j<7;j++)
				{if(arr[i][j]==1)
					{count++;}
				}
			}
		System.out.println(count);
	}
	void printlist()
	{for (int number : t) {
	    System.out.print(number+ " ");
	}
	System.out.println();
	}
	cB checkhit(int posx,int posy)
	{if(posx>6 || posy>6 || posx<0 || posy<0)
	{System.out.println("Wrong Entry, Put in again");
		return this;}
	System.out.println(posx+","+posy);
		if(arr[posx][posy]!=2 && arr[posx][posy]!=-1)
		{if(arr[posx][posy]==0)
		{System.out.println("Miss!");
		arr[posx][posy]=-1;
		}
		else if(arr[posx][posy]==1)
		{System.out.println("Hit!");
		arr[posx][posy]=2;
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
	String checkfinal()
	{
	int i,j,t=0;	
	for(i=0;i<7;i++)
	{for(j=0;j<7;j++)
		{if(arr[i][j]==1)
		{t=1;}
		}
	if(t==1)
	{break;}
	}
	if(i==7)
	{this.k="Won!";}
	return this.k;
	}
	}
/*class Ship{
	Ship(int d, cB s)
	{int x=(int)(Math.random()*5);
	int y=(int)(Math.random()*5);
		
	}
	
}*/
public class bp {
	public static void main(String[] args)
	{cB board=new cB();
	board.display();
	//board.countOne();
	Scanner inputx = new Scanner(System.in);
	Scanner inputy = new Scanner(System.in);
	while(board.getString()!="Won!")
	{int numberx = inputx.nextInt();
	int numbery = inputy.nextInt();
	//System.out.println(numberx+","+numbery);
	board.checkhit(numberx,numbery);
	}
	}	
}
