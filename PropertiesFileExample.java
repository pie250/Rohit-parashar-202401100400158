import java.io.*;
import java.util.Properties;
public class PropertiesFileExample {
public static void main(String[] args) throws IOException {
   
    Properties p=new Properties();
    p.setProperty("db.user","rohit");
    p.setProperty("db.password","secret");
    FileOutputStream fos=new FileOutputStream("db.properties");
    p.store(fos,"Db Properties");
    System.out.println("File has been created");

    Properties p2=new Properties();
    FileInputStream fis=new FileInputStream("db.properties");
    p2.load(fis);
    System.out.println("File has been Loaded");
    fis.close();
    System.out.println(p.getProperty("db.user"));
    System.out.println(p2.getProperty("db.password"));
}
}
