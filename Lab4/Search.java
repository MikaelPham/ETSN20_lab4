import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Search {

    public static void searchPattern(String pattern, String file) {
        try (Scanner sc = new Scanner(new File(file))) {    
            while (sc.hasNextLine()) {
                String line = sc.nextLine(); 
                if (line.contains(pattern))
                    System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File path could not be found");
        }
    }

    public static void main(String[] args) {
        if (args[0].equalsIgnoreCase("search") && args.length == 3) {
            searchPattern(args[1], args[2]);
        } else {
            System.out.println("Invalid command input");
        }
    }
}