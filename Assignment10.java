/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment10;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author hp
 */

public class Assignment10 {
 public static int yn;
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
       try 
                {
                    Scanner sc = new Scanner(System.in);

                    Class.forName("com.mysql.jdbc.Driver");
                    System.out.println("Driver Loaded");

                    //step 2: obtain connection object
                     Connection con;
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useSSL=false", "root", "root");
                    Statement stmt= con.createStatement();
                    ResultSet rs;
                    
                   int rno,s1,s2,s3,total;
                   float per;
                   String name;
                   do {
                       System.out.println("1.Insert");
                       System.out.println("2.Update");
                       System.out.println("3.Delete");
                       System.out.println("4.display");
                       System.out.println("5.stop");
                       System.out.println("");
                       int Choice = sc.nextInt();
                      switch(Choice){
                          case 1 :
                              System.out.println("---------Insert-----------");
                              System.out.println("Rno ? ");
                              rno=sc.nextInt();
                              System.out.println("Name ? ");
                              name=sc.next();
                              System.out.println("sub1 ? ");
                              s1=sc.nextInt();
                              System.out.println("sub2 ? ");
                              s2=sc.nextInt();
                              System.out.println("sub3 ? ");
                              s3=sc.nextInt();
                              total=s1+s2+s3;
                              per=total/3;
                              int countInsert =stmt.executeUpdate("insert into student values('" + rno + "','" + name + "','" + s1 + "','" + s2 + "','" + s3 + "','" + total + "','" + per + "')");
                              System.out.println(countInsert + "Row Inserted");
                              break;
                          case 2 :
                               System.out.println("---------Update-----------");
                              System.out.println("Rno ? ");
                              rno=sc.nextInt();
                              System.out.println("Name ? ");
                              name=sc.next();
                              int countUpdate =stmt.executeUpdate("Update student set name='"+ name +"' where rno = "+ rno );
                              System.out.println(countUpdate+"Row Updated");
                              break;
                          case 3 :
                              System.out.println("---------Delete-----------");
                              System.out.println("Rno ? ");
                              rno=sc.nextInt();
                               int countDelete =stmt.executeUpdate("Delete from student where rno = "+ rno );
                               System.out.println(countDelete+"Row Deleted");
                               break;
                          case 4 :
                              rs= stmt.executeQuery("select * from student");
                              while(rs.next()){
                                  System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t " +rs.getInt(4)+ "\t" +rs.getInt(5)+ "\t " + rs.getInt(6) + " \t " + rs.getFloat(7) );
                          
                              }
                              break;
                          default :
                              System.out.println("Invalid Option");
                                                                  
                      }
                      System.out.println("Do you want to continue 1/0     ");
                      yn=sc.nextInt();
                      
                   }
                   while(yn==1);        
                
                }
       catch(Exception e){
           
           System.out.println(e.getMessage());
       }
       
    }
    
}
