import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj_RectangleFile {
    public static void main(String[] args) {

        ArrayList<Rectangle> rectangleList=new ArrayList<Rectangle>();
        fillArrayList(rectangleList);
        printRectangles(rectangleList);
    }

    public static void fillArrayList(ArrayList<Rectangle> rectangleAl){
        Scanner inFile;
        try{
            inFile=new Scanner(new File("rectangle_data.txt"));
            Rectangle temp;
            double length;
            double width;
            while(inFile.hasNext()){
                length=inFile.nextDouble();
                width=inFile.nextDouble();
                temp=new Rectangle(length,width);
                rectangleAl.add(temp);
            }
            inFile.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public static void printRectangles(ArrayList<Rectangle> rectangleAl){
        for(Rectangle r:rectangleAl){
            System.out.println("Length: "+r.getLength());
            System.out.println("Width: "+r.getWidth());
            System.out.println("Area: "+r.area());
            System.out.println("Perimeter: "+r.perimeter());
            System.out.println();
        }
    }
}
