import java.util.*;
import java.io.*;
public class FileScan {
public static void main(String[] args)
{
System.out.println("Three numbers and a line");
System.out.println("of text from f.txt");
Scanner inputStream=null;
	try {
		inputStream=new Scanner(new FileInputStream("f.txt"));
		System.out.println("In try");
	}
	catch(FileNotFoundException e)
	{System.out.print("File f.txt wasn't found ");
	System.out.println("or couldn't be found.");
	System.exit(0);	
	}

	int n1=inputStream.nextInt();
	int n2=inputStream.nextInt();
	int n3=inputStream.nextInt();
	inputStream.nextLine();
	String line=inputStream.nextLine();
	System.out.print("Three numbers read from the file are: ");
	System.out.println(n1+", "+n2+" and "+n3+".");
	System.out.println("The line read from the file is:");
	System.out.println(line);
	inputStream.close();
	
}
}
