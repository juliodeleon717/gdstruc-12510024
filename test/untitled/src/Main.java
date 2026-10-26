import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is yo name");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        //change
        // another change to test stuff yadda yadda
        // asdjasljdj
        int[] numbers = new int[3];
        numbers[0] = 67;
        numbers[1] = 21;
        numbers[2] = 69;
        
        for (int i = 0; i < numbers.length; i++)    
        {

            System.out.println(numbers[i]);
        }
    }
}
