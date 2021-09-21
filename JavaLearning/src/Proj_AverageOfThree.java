import java.util.Scanner;

public class Proj_AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        double num1,num2,num3;
        double average;

        System.out.println("Plz enter 3 numbers");

        num1= keyboard.nextFloat();
        num2= keyboard.nextFloat();
        num3= keyboard.nextFloat();

        average=(num1+num2+num3)/3.0;

        System.out.println("The average of 3 numbers is: " +average);
    }
}
