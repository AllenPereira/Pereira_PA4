
import java.io.*;
public class Application {

	public static void main(String Args[]) throws IOException{
		
		FileInputStream inputFile = null;
		FileOutputStream outputFile= null;
		
		try {
			inputFile = new FileInputStream("problem2.txt");
			outputFile = new FileOutputStream("unique_word_counts.txt");
		
			DuplicateCounter duplicateCounter = new DuplicateCounter();
			duplicateCounter.count(inputFile);
			duplicateCounter.write(outputFile);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				inputFile.close();
				outputFile.close();
			}
			catch(Exception e) {
				e.getMessage();
			}
		}
	}
	
	
	
}
