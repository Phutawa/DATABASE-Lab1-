import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception{
        Scanner filePath = new Scanner(System.in);
        String path = filePath.nextLine();
        File f = new File(path);
        try {
            Scanner readFile = new Scanner(f);
            while (readFile.hasNext()) {
                String line = readFile.nextLine();
                System.out.println(line);

            }
            readFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error! " + e.getMessage());
            e.printStackTrace();
        } 
    }
}