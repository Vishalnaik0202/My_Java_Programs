
//Reading from CharacterArrayReader and Writing to characterArrayWritter 
import java.io.*;// importing for input/output streams classes
import java.util.Scanner;// importing for taking input from user
        
public class Assignment4 {

    public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);//creating scanner object
        System.out.println("Enter a string :");
        String s = sc.nextLine();//Reading String 
        char[] charArray=s.toCharArray();//converting String to a character Array
        CharArrayReader cr=new CharArrayReader(charArray);//Creating object of type character array reader
        CharArrayWriter cw=new CharArrayWriter();//Creating object of type character array Writter
        int ch;
        while((ch=cr.read())!= -1) //Reading string byte by byte
        {
            System.out.print((char)ch); // printing string 
            cw.write(ch);// assigning string to character array writter
        }
        System.out.print("\n Data in CharArrayWriter = ");
        System.out.println(cw.toString()); // printing string from character array writter
        
    }
    
}
