/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment12;

import java.net.*;
import java.io.*;
import java.util.Date;

/**
 *
 * @author hp
 */
public class Assignment12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO code application logic here
        int c;
        URL myURL = new URL("http://www.gmail.com");
        URLConnection uc = myURL.openConnection();
        System.out.println("Date : "+new Date(uc.getDate()));
        System.out.println("Content-Type :"+uc.getContentEncoding());
        System.out.println("Expires :"+uc.getExpiration());
        System.out.println("Last Modified : "+new Date(uc.getLastModified()));
        int len=uc.getContentLength();
        System.out.println("Content Length : "+len);
        if(len>0){
            System.out.println("-----------------------Content-------------------------");
            InputStream input = uc.getInputStream();
            int i=len;
            while(((c=input.read()) != -1)&&(--i>0))
            {
                System.out.print((char)c);
        }
            input.close();
        }
        else{
            System.out.println("No Content available");
        }
        
    }
    
}
