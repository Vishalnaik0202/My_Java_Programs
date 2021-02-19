/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.*;

/**
 *
 * @author hp
 */
public class Assignment8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Dictionary students = new Hashtable();
       System.out.println("Enter Five Records in Dictionary ");
       for(int i=0; i<5;i++){
          System.out.print("Enter Roll No. :");
           int rno=sc.nextInt();
          
           System.out.print("Enter Student Name :");
           String name = sc.next();
           
           students.put(rno,name);
           
       }
        boolean exist = false;
        boolean go=true;
        while(go){
            System.out.println("options : \n 1.Search 2.Exit \n ");
            int choice =sc.nextInt();
            
            switch(choice){
                case 1:
                System.out.println("Enter Roll No to Search : \t");
                int rno=sc.nextInt();
                for(Enumeration k = students.keys(); k.hasMoreElements(); ){
                    if((int)k.nextElement() == rno ){
                    System.out.println("\n Name : \t " +students.get(rno));
                    exist = true;
                    }
                }
                if(exist == false)
                    System.out.println("Record  Not Exist ");
                    break;
                case 2:
                    go=false;
                    break;
                default :
                    System.out.println("Invalid Input ");
                
                    
               
            }
        
    }
    }
    
}
