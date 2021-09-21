import java.util.Scanner;

public class Proj_LearningPackages {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        int packageNumber;
        int courseCount;
        int baseCost;
        int costPerCourse;
        int numIncluded;
        int totalCost;

        System.out.println("Which of the packages you want? 1,2, or 3?");
        packageNumber=keyboard.nextInt();

        System.out.println("How many courses did you enroll in this month?");
        courseCount=keyboard.nextInt();

        if(packageNumber==1){
            baseCost=10;
            costPerCourse=6;
            numIncluded = 2;
        }
        else if(packageNumber==2){
            baseCost=12;
            costPerCourse=4;
            numIncluded = 4;
        }
        else{
            baseCost=15;
            costPerCourse=3;
            numIncluded = 6;
        }
        // calculate total cost
        if(courseCount>numIncluded){
            totalCost=baseCost+(courseCount-numIncluded)*costPerCourse;
        }
        else{
            totalCost=baseCost;
        }

        System.out.println("Total cost is $"+totalCost);
    }
}
