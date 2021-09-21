import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Proj_TwiceNums {
    public static void main(String[] args) {
        Scanner inFile;
        PrintWriter writer;
        try{
            inFile=new Scanner(new File("input.txt"));
            writer=new PrintWriter("twice_nums.txt");
            int input;
            while(inFile.hasNext()){
                input=inFile.nextInt();
                writer.println(input*2);
            }
            inFile.close();
            writer.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Some error while accessing the File");
            System.out.println(e.getMessage());
        }
    }
}
