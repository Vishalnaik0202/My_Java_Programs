//write a program to use any five methads of character class and five methods of boolean class
package assignment5;


import java.lang.*;
public class Assignment5 {

    public static void main(String[] args) {
        
        System.out.println("The value of isLetter('a') is :" + Character.isLetter('a'));
        System.out.println("The value of isDigit('b') is :" + Character.isDigit('a'));
        System.out.println("The value of isUpperCase('a') is :" + Character.isUpperCase('a'));
        System.out.println("The value of isLowerCase('a') is :" + Character.isLowerCase('a'));
        System.out.println("The value of toString('a') is :" + Character.toString('a'));
        System.out.println("The value of toLowerCase('B') is :" + Character.toLowerCase('B'));
        System.out.println("The value of toLowerCase('b') is :" + Character.toUpperCase('b'));
        
        System.out.println(" ");
        
        // Creating a boolean object and assigning value to it. 
        Boolean bool1 = new Boolean(true); 
        Boolean bool2 = new Boolean(false); 
        System.out.println("Boolean object - bool1 : "+bool1); 
        System.out.println("Boolean object - bool2 : "+bool2); 
  
  
        // Creating a boolean primitive bool2 
        boolean bool3, bool4 ; 
        // Use of booleanValue() 
        // Assigning object value to pritimive varialble. 
        bool3 = bool1.booleanValue(); 
        System.out.println("Primitive value of object i.e. bool3 : "+bool3); 
  
        bool4 = bool2.booleanValue(); 
        System.out.println("Primitive value of object i.e. bool4 : "+bool4); 
        System.out.println(""); 
        
         // Use of compareTo() method 
        int comp = bool1.compareTo(bool2); 
        if (comp > 0) 
            System.out.println("bool1 is greater than bool2 as comp = "+comp); 
        if (comp == 0) 
            System.out.println("bool1 is equal to bool2 as comp = "+comp); 
        if (comp < 0) 
            System.out.println("bool1 is less than bool2 as comp = "+comp); 
        System.out.println(""); 
        
        
         // String reperesentation of the boolean object 
        //3. Use of toString() method. 
        String s1, s2; 
        s1 = bool1.toString(); 
        s2 = bool2.toString(); 
        System.out.println("String value of bool1 : " + s1); 
        System.out.println("String value of bool2 : " + s2); 
        
        // HashCode value of the boolean object. 
            // 4: use of hashCode() method 
            int h1 = bool1.hashCode(); 
            int h2 = bool2.hashCode(); 
            System.out.println("Hash Code value of bool1 : " + h1); 
            System.out.println("Hash Code value of bool2 : " + h2); 
            System.out.println(""); 
            
            
            Boolean b1 = new Boolean(true);  
            Boolean b2 = new Boolean(false);       
            

            //  5.method will give the result of equals method on b1,b2

             if(b1.equals(b2))  
                 System.out.println("equals() method returns true");  
             else
                 System.out.println("equals() method returns false");
    }
    
}
