//program to convert Lowercase to Uppercase in a string using byte array
import java.io.*;// importing for input/output streams classes
import java.io.ByteArrayInputStream; // importing for ByteArrayInputStream Classes
import java.util.Scanner;// importing for taking input from user


public class Assignment2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//creating object for scanner classes
        System.out.println("Enter String");
        
        String s = sc.nextLine();//Taking Input from user
        byte[] b= s.getBytes();//Converting String into ByteArray 
        ByteArrayInputStream bis=new ByteArrayInputStream(b); //Creating object of type ByteArrayInputStream
        ByteArrayOutputStream bos= new ByteArrayOutputStream(b.length);//Creating object of type ByteArrayOutputStream
        int n;
        while ((n=bis.read())!=-1)//Reading string byte by byte
        {
            char c = (char)n;
            //checking caracter is in uppercase or Lowercase
            if (Character.isUpperCase(c))
                c=Character.toLowerCase(c);//converting caracter into LowerCase
            else
                c=Character.toUpperCase(c);//Converting caracter into UpperCase
                bos.write((int)c); // assigning string to ByteArrayOutputStrean
                                     
        }
        System.out.println(bos.toString());//Printing ByteArrayOutputStream
    }
}