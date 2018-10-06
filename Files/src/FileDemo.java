import java.io.*;
//import java.util.*;
public class FileDemo {
	public static void main(String[] args)
	{PrintWriter outStream=null;
	//Scanner inputStream=null;
	
	try {outStream=new PrintWriter(new FileOutputStream("stuff.txt"));
	}
	catch(FileNotFoundException e)
	{System.err.println("Error opening the file stuff.txt");
	System.exit(0);
	}
	outStream.print("The quick brown fox ");
	outStream.println("jumped over the lazy dog.");
	outStream.close();
	}
}
