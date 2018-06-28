import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(new File("casos/")).useDelimiter("\n");;

         String[] line = scanner.next().split(" ");
         scanner.next();
         
	}

}
