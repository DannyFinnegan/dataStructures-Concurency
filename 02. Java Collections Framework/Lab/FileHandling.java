package Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "02. Java Collections Framework/Lab/hamlet.txt";  //Updated path to the file hamlet.txt
        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    System.out.println("''" + word + lineNumber);
                }
                lineParser.close();
                lineNumber++;
            }
            in.close(); // closed scanner after the loop, ensuring it remains open until the loop is done.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}