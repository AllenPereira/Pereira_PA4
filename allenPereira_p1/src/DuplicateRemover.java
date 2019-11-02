import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.*;
import java.util.ArrayList;
public class DuplicateRemover {
	
	private ArrayList<String> uniqueWords = new ArrayList<String>();
	
	public void remove(FileInputStream dataFile) throws IOException {
		
	
		Scanner scnr = new Scanner(dataFile);
		while(scnr.hasNext()) {
			uniqueWords.add(scnr.next());
		}
		
		Set<String> wordSet = new HashSet<>(uniqueWords);
		uniqueWords.clear();
		
		uniqueWords.addAll(wordSet);
		
		
		scnr.close();
		}
		
		
		
	
	
	public void write(FileWriter outputFile) throws IOException {
		int i;
		
		
		for(i=0; i<uniqueWords.size(); i++) {
			outputFile.write(uniqueWords.get(i));
			outputFile.write("\n");
			outputFile.flush();
		}
		outputFile.close();
	}
}
