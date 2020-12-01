//Addition of two numbers
package add;
import java.util.Scanner;
public class Add{
    public static void main(String[] args){
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:");
        num1=sc.nextInt();
        System.out.print("Enter Second Number:");
        num2=sc.nextInt();
        
        System.out.println("Addition="+(num1+num2));
    }
}
