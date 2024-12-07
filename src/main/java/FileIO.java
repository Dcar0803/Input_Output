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
	
	
	 public static String readFromFile(String filename) throws IOException {
	        
		 StringBuilder content = new StringBuilder();
	       
	        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
	            
	        	String line;
	            
	            while ((line = reader.readLine()) != null) {
	                
	            	content.append(line).append(System.lineSeparator());
	            }//end of while loop 
	        
	        }//end of try 
	     
	        if (content.length() > 0) {
	            
	        	content.setLength(content.length() - System.lineSeparator().length());
	        
	        }//end of if statement
	        
	        return content.toString();
	        
	    }//end of readFromFile

}//end of FileIO class 
