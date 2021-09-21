import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Proj_SumOfNumbersInFile {
    public static void main(String[] args) {
        Scanner inFile;
        int input;
        int sum=0;
        try{
            inFile=new Scanner(new File("input.txt"));
            while(inFile.hasNext()){
                input=inFile.nextInt();
                sum+=input;
            }
            System.out.println("Sum of all numbers in file are : "+sum);
            inFile.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Can't find file");
            System.out.println(ex.getMessage());
        }
    }
}
