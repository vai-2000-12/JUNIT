package src;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.ClassRule;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class HTest {

    @BeforeClass
    public static void print(){
        System.out.println("Testing Is Started..");
    }
    
    @ClassRule
    public static  TemporaryFolder folder = new TemporaryFolder();
    
    @Test
    public void testToWriteFile()throws IOException{
        File fileU = folder.newFile("testFile.txt");

        H h = new H();
        String content  = "Hello World";
        h.writeToFile(fileU, content);

        String fileContent = new String(Files.readAllBytes(fileU.toPath()));
        assertEquals(content, fileContent);
    }

    @Test
    public void testToWriteFile1()throws IOException{
        File fileU1 = folder.newFile("textFile1.txt");

        H h = new H();
        String content1 = "Hello World";
        h.writeToFile(fileU1, content1);

        String fileContent1 = new String(Files.readAllBytes(fileU1.toPath()));
        assertEquals(content1, fileContent1);
    }

    @AfterClass
    public static void print1(){
        System.out.println("Testing Finished..");
    }
}
