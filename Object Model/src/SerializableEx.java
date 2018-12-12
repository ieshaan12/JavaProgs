import java.io.*;
/*
class SerializableEx implements Serializable  {
	// Normal variables 
    int i = 20;
    transient float j = 30; 
    
    public static void main(String[] args) throws Exception 
    { 
        SerializableEx input = new SerializableEx(); 
  
        // serialization 
        FileOutputStream fos = new FileOutputStream("abc.txt"); 
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
        oos.writeInt(input.i); 
        oos.writeFloat(input.j); 
        oos.close();
  
        // de-serialization 
        FileInputStream fis = new FileInputStream("abc.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
       
        System.out.println("i = " + ois.readInt()); 
        System.out.println("j = " + ois.readFloat()); 
        
        ois.close();
    } 

}*/

//Uncomment the following lines to see the impact of transient on writeObject and readObject
 public class SerializableEx implements Serializable  {
// Normal variables 
   int i = 20;
    transient float j = 30; 
    
     public static void main(String[] args) throws Exception 
     { 
     	SerializableEx input = new SerializableEx(); 
  
//         // serialization 
       FileOutputStream fos = new FileOutputStream("abc.txt"); 
     ObjectOutputStream oos = new ObjectOutputStream(fos); 
         oos.writeObject(input);
         oos.close();
  
//         // de-serialization 
         FileInputStream fis = new FileInputStream("abc.txt"); 
         ObjectInputStream ois = new ObjectInputStream(fis); 
       
         SerializableEx output = (SerializableEx)ois.readObject();
         System.out.println("i ="+ output.i + " j ="+output.j);
         ois.close();
     } 
}