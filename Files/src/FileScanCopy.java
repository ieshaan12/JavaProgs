import java.util.*;
import java.io.*;
public class FileScanCopy {
public static void main(String[] args)
{Scanner inputStream=null;
PrintWriter outputStream=null;
try {
	inputStream=new Scanner(new FileInputStream("k.txt"));
	outputStream=new PrintWriter(new FileOutputStream("kout.txt"));
}
catch(FileNotFoundException e)
{System.out.println("Files not found");
System.exit(0);
}
String line;
int count=0;
while(inputStream.hasNextLine())
{line=inputStream.nextLine();
count++;
outputStream.println(count+" "+line);
}
inputStream.close();
outputStream.close();
}
}
