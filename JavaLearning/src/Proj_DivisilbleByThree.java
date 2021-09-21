import java.util.Scanner;

public class Proj_DivisilbleByThree {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Plz enter your Number");
        int number= keyboard.nextInt();

        if(number%3==0){
            System.out.println(number+" is divisible by 3");
        }
        else{
            System.out.println(number+" is not divisible by 3");
        }

    }
}
