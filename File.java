import java.io.File;
import java.io.*;

public class File {
    public static void main(String[] args) {
        
        
        File f1=new File("C:\\Users\\hp\\OneDrive\\Desktop\\IBM.pdf");
        System.out.println("File Name:" +f1.getName());
        System.out.println("last File modified:" +f1.lastModified());
        System.out.println("File Size:" +f1.length()+"Bytes");
        System.out.println("Path:" +f1.getPath());
        System.out.println("Absolute Path:" +f1.getAbsolutePath());
        System.out.println("Parent:" +f1.getParent());
        System.out.println(f1.exists()?"File exist":"File Not Exist");
        System.out.println(f1.canRead()?"File is Readable":"File is not Readable");
        System.out.println(f1.canWrite()?"File is Writable ":"File is not Writable ");
        System.out.println(f1.isHidden()?"File is Hidden":"File is not Hidden");
        System.out.println(f1.isDirectory()?"Is a Directory":"Is not a Directory");
        System.err.println(f1.isFile()?"Is a File":"Is not a File");
        System.out.println(f1.isAbsolute()?"File is Absolute":"File is not Absolute");
        
    }
  
}
