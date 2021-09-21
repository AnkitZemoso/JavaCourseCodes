import java.util.Scanner;

public class Proj_MadLibClone {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        String adjective1;
        String girlName;
        String adjective2;
        String occupation1;
        String placeName;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boyName;
        String manName;

        System.out.print("Enter an adjective\t");
        adjective1=keyboard.nextLine();

        System.out.print("Enter the girl name\t");
        girlName=keyboard.nextLine();

        System.out.print("Enter another adjective\t");
        adjective2=keyboard.nextLine();

        System.out.print("Enter an occupation\t");
        occupation1=keyboard.nextLine();

        System.out.print("Enter the name of a place\t");
        placeName=keyboard.nextLine();

        System.out.print("Enter the name of a piece of clothing\t");
        clothing=keyboard.nextLine();

        System.out.print("Enter the name of a hobby\t");
        hobby=keyboard.nextLine();

        System.out.print("Enter another adjective1\t");
        adjective3=keyboard.nextLine();

        System.out.print("Enter another occupation\t");
        occupation2=keyboard.nextLine();

        System.out.print("Enter the boy name\t");
        boyName=keyboard.nextLine();

        System.out.print("Enter the man name\t");
        manName=keyboard.nextLine();

        System.out.println();

        System.out.println(" There once was a "+ adjective1 + " girl named " + girlName+ " who was a "+
                adjective2 + " "+ occupation1 +" in the Kingdom of "+placeName +".");

        System.out.println("She loved to wear "+ clothing +" and to "+hobby +". She wanted to marry the "+
                adjective3 +" "+ occupation2 +" named "+ boyName + " but her father, King "+manName +" forbid her " +
                "from seeing him");
    }
}
