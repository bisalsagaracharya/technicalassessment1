package serialization;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Driver {
	
   public static void main(String[] args) {
	try (PrintStream printStream = new PrintStream( "Empploye.txt")){
		printStream.print(new Employe(1,"Bisal","Developer",25));
		
	} catch (FileNotFoundException e) {
		 e.printStackTrace();
	}
}

}
