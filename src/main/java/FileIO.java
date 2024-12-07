import  java.io.*;

public class FileIO {
	
	public static void writeToFile(String filename, String content) throws IOException {
		
		try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        }//end of try
		
	}//end of writeToFile method 
	
	

}//end of FileIO class 
