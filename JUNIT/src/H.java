//-- Example to show that How to use @ClassRule Annotation..
// @ClassRule Annotation Class Must be Static because its Executes the Only Once when the Test Starts

package src;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class H {
   
    public void writeToFile(File file , String content)throws IOException{
      try(FileWriter FW = new FileWriter(file)){
          FW.write(content);
      }
    }
}
