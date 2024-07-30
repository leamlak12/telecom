
package Tel;
import java.io.*;
import java.util.*;

public class PackageStatus {
    public static void ps() throws FileNotFoundException{
    File f=new File ("myfile.txt");
   Scanner inp= new Scanner(f);
    while(inp.hasNext())
        try{
    {
       
        System.out.println(inp.nextLine());
      
    }

        }catch (Exception e){
            System.out.println();
        }
    }
}
