import org.apache.log4j.Logger;  
  
import java.io.*;  
import java.sql.SQLException;  
import java.util.*;  
  
public class Examplelog4j2{  
  
   /* Get the class name to be printed on */  
   static Logger log = Logger.getLogger(Examplelog4j2.class.getName());  
     
   public static void main(String[] args)throws IOException,SQLException{  
      log.debug("Hello this is a debug message");  
      log.info("Hello this is an info message");  
   }  
}  