import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
public class DuplicateCounter {
		
	private Integer wordCounter;
	private HashMap<String, Integer> words = new HashMap<String, Integer>();
		
	
	public void count(FileInputStream dataFile) throws IOException {
		
		Scanner scnr = new Scanner(dataFile);
		while(scnr.hasNext()) {
			String word = scnr.next();
			wordCounter = words.get(word);
			if(wordCounter != null) {
				 wordCounter++;
			}
			else {
				wordCounter=1;
				
			}
			words.put(word, wordCounter);
			}
		
		 scnr.close();
	}
	
	public void write(FileOutputStream outputFile) throws IOException {
		PrintWriter outFS = new PrintWriter(outputFile);
		outFS.println(words);
		outFS.flush();
		outputFile.close();
	}
	
	 
}
