import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Proj_WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<String>();
        names.add("Ankit");
        names.add("Rahul");
        names.add("Vansh");
        names.add("Sanket");
        names.add("Aman");

        try{
            PrintWriter writer=new PrintWriter("output.txt");
            for(String name:names){
                writer.println(name);
            }
            writer.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Unable to write to file");
        }
    }
}
