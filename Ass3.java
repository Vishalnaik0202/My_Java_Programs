// to Reverse a string
import java.io.*;// importing for input/output streams classes
import java.util.Scanner; // importing for taking input from user
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//creating scanner object
        System.out.println("Enter a string :");
        String s= sc.nextLine(); // accepting string from user
        String str= " ";
        byte [] b=s.getBytes(); //creating byte array
        // creating object of ByteArrayInputStream
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        int n;
        while((n=bis.read())!=-1)// reading bytes of string
        {
            // Converting string to Upper case
            System.out.print(Character.toUpperCase((char)n));
            str=str+((char)n);
        }
        System.out.print("\nReverse of string data :\n");
        //converting String in reverse order
        for(int i=(str.length()-1);i>=0;i--)
            //printing converted string 
             System.out.print(str.charAt(i));
    }
    
}
