/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment11;
import java.net.*;
/**
 *
 * @author hp
 */
public class Assignment11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Local Host Address : " + address);
            address = InetAddress.getByName("www.google.com");
            System.out.println("google Address : " + address);
            InetAddress []allAddresses = InetAddress.getAllByName("www.google.com");
            for (int i = 0; i < allAddresses.length; i++) {
                System.out.println("Address " + i + 1 + ": " + allAddresses[i]);
            }
        } catch (UnknownHostException e) {
        }
    }
    
}
