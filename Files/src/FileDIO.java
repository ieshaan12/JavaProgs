import java.io.*;
public class FileDIO {
public static void main(String[] args)
{PrintWriter outStream=null;
try {
outStream=new PrintWriter(new FileOutputStream("S.txt"));
outStream.print("The brown");
outStream.println(" shirt is good.");
}
catch(IOException e)
{System.err.println(e.getMessage());
}
finally
{outStream.close();
}
}
}