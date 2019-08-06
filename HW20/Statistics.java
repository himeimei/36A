/**
 * 
 * @author Huimei Wu
 * CIS 36A
 *
 */
import java.io.*;
import java.util.Scanner;
public class Statistics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        int count = 0;
        String word, line;
        File infile = new File("sonnet.txt");
        Scanner input = new Scanner(infile);
        while (input.hasNext()) {
        		word = input.next();
            count++;
        }
        
        File outfile = new File("statistics.txt");
        PrintWriter output = new PrintWriter(outfile);
        output.println("The sonnet has " + count + " words");
        input.close();
  
        input = new Scanner(infile);
        count = 0; //reset count variable to 0
        while (input.hasNextLine()) {
        		line = input.nextLine();
            count++;
        }
        
        output.println("The sonnet has " + count + " lines");
        input.close();
        output.close();
    }
}

