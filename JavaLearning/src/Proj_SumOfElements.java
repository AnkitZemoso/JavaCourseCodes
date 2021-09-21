import java.util.ArrayList;

public class Proj_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int sum=sumElements(list);

        System.out.println("The sum is: "+sum);
    }

    public static int sumElements(ArrayList <Integer> list){
        int sum=0;
        for(int i:list){
            sum+=i;
        }

        return sum;
    }
}
