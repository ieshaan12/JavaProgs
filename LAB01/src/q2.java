
public class q2 {
	public static void main (String[] args) {
		   /* */
		for(int k=0;k<args.length;k++)
		{System.out.print(args[k]+"/");}
	    	System.out.println();
		for(int i=0;i<args.length-1;i++)
		    {for(int j=i+1;j<args.length-1;j++)
		        {if(Integer.parseInt(args[args.length-1])==Integer.parseInt(args[i])+Integer.parseInt(args[j]))
		            {System.out.println(args[i]+" "+args[j]);}
		        }
		    }
}
}
