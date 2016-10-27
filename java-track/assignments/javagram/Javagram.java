package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Javagram {
	
	public static String[] optionsMenu = {"exit", "BlueFilter", "InvertFilter", "GrayscaleFilter"};

	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath = null;
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		boolean failedSelection = true;
		Filter filter = null;
		
		
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
				String[] relPathParts = relPath.split(File.separator);
				imagePath = dir + File.separator + String.join(File.separator, Arrays.asList(relPathParts));
				
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
			
		
		
		// TODO - prompt user for filter and validate input
		int user = -1;
		do{
			user = menuFunction(in);
		//}while(user < 0 || user > optionsMenu.length-1);
		// TODO - pass filter ID int to getFilter, and get an instance of Filter back 
		try{
			filter = getFilter(user);			
		}catch(Exception e){
			System.out.println("bad getFilter operation.");
			
		}
		}while(filter == null);//alternate
		
		// filter and display image
		
		
		Picture processed = filter.process(picture);
		processed.show();
		
		
		System.out.println("Image successfully filtered");
		
		// save image, if desired
		String fileName = null;
		boolean OverWriteProtect = true;
		String checkWrite = "n";
		do{
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		fileName = in.next();
		if(fileName.equals(relPath)){
			System.out.println("This will overwrite the original.  Are you sure? (Y/N) ");
			checkWrite = in.next();
		}
		if(checkWrite.equals("y") || checkWrite.equals("Y"))
			OverWriteProtect = false;
		
		}while(fileName.equals(relPath) && OverWriteProtect);
		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		
		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
		}else {
			String absFileName = dir + File.separator + fileName;
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
		}	
		
		// close input scanner
		in.close();
	}
	
	private static int menuFunction(Scanner in) {
		System.out.println("Please Select an option");
		for(int i = 0; i < optionsMenu.length ; i++){
			System.out.println(i + "):  " + optionsMenu[i]);
		}
		
		int blah = -1;
		String dumbdumb;
		//Scanner men = new Scanner(System.in);
		if(in.hasNextInt())
			blah = in.nextInt();
		else
			dumbdumb = in.next();
			//System.out.println("Bad Selection");
		
		
		return blah;
		
	}
	
	// TODO/done - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter
	private static Filter getFilter(int selection) throws Exception {
		
		switch(selection){
			case 1:
				return new BlueFilter();
			case 2:
				return new InvertFilter();
			case 3:
				return new GrayscaleFilter();
			
			default:
				//default should be exit;
				throw new Exception();
				//return new BlueFilter();
		}
		// TODO - create some more filters, and add logic to return the appropriate one
		
		
	}

}