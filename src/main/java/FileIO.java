import  java.io.*;

public class FileIO {
	
	 /**
     * Writes the given content to a file with the specified filename.
     * If the file exists, it overwrites the content.
     *
     * @param filename the name of the file to write to
     * @param content  the content to write to the file
     * @throws IOException if an I/O error occurs
     */
	
	public static void writeToFile(String filename, String content) throws IOException {
		
		try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        }//end of try
		
	}//end of writeToFile method 
	
	

}//end of FileIO class 
