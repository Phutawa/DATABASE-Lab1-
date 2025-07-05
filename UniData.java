// 672115037 Phutawan Mueangma
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UniData {
    public static void main(String[] args) {
        try {
            Scanner FilePath = new Scanner(System.in);
            System.out.println("Input file path: ");
            String path = FilePath.nextLine();
            File F = new File(path);
            FileWriter myWriter = new FileWriter(F, true);
            myWriter.append("\n571,601-650,Chiang Mai University,TH,Thailand,XL,FC,HI,4,A,33.8,256,19.3,466,16.4,701+,3.9,701+,5.1,701+,4.1,701+,20.9,538,17.1,495,59.2,252=,20.7");
            myWriter.close();
            System.out.println("Write Successful");
        } catch (IOException e) {
            System.out.println("Error! " + e.getMessage());
            e.printStackTrace();
        }
    }
}
