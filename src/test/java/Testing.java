import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class Testing {

	private static final String TEST_FILE = "testFile.txt";
	
	
	  @BeforeEach
	    void setUp() throws IOException {
	        // Clean up before each test
	        File file = new File(TEST_FILE);
	        if (file.exists()) {
	            file.delete();
	        }
	    }//end of setUp
	  
	  @AfterEach
	    void tearDown() throws IOException {
	        // Clean up after each test
	        File file = new File(TEST_FILE);
	        if (file.exists()) {
	            file.delete();
	        }
	    }//end of tearDown
	  
	  
	@Test
    void testWriteToFile() {
		
        
		String content = "Hello, World!";
        
		assertDoesNotThrow(() -> FileIO.writeToFile(TEST_FILE, content));
        
		assertTrue(new File(TEST_FILE).exists());
    
	}//end of testWriteToFile
	
}//end of Testing class 

