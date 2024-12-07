import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {

	private static final String TEST_FILE = "testFile.txt";
	
	@Test
    void testWriteToFile() {
		
        
		String content = "Hello, World!";
        
		assertDoesNotThrow(() -> FileIO.writeToFile(TEST_FILE, content));
        
		assertTrue(new File(TEST_FILE).exists());
    
	}//end of testWriteToFile
	
}//end of Testing class 

