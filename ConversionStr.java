/*program to convert Lowercase to Uppercase in a string using byte array*/
import java.io.*;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class ConversionStr{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        
        String s = sc.nextLine();
        byte[] b= s.getBytes();
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        ByteArrayOutputStream bos= new ByteArrayOutputStream(b.length);
        int n;
        while ((n=bis.read())!=-1)
        {
            char c = (char)n;
                       
            if (Character.isUpperCase(c))
                c=Character.toLowerCase(c);
            else
                c=Character.toUpperCase(c);
                bos.write((int)c);
                                     
        }
        System.out.println(bos.toString());
    }
}

