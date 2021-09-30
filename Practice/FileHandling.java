import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class FileHandling{

	public static void main(String args[]){
		System.out.println("Enter file name: ");
		Scanner s = new Scanner(System.in);
		String fileName = s.nextLine()+".txt";
		File myfile = new File(fileName); // Create a new file
		try{
			myfile.createNewFile();
		}
		catch(IOException e){
			System.out.println("Error :: Unable to create file "+fileName);
			e.printStackTrace();
		}

		// Writing to a file 
		try{
			FileWriter fileWriter = new FileWriter(fileName);
			fileWriter.write("Fabian Mazur & Snavs -> Arena \nRl Grime -> UCLA \nAero Chord X Woflgang Gartner -> Borneo");
			fileWriter.close();	
		}
		catch(Exception e){
			System.out.println("Error :: Unable to write to the file.");
			e.printStackTrace();
		}

	}
}