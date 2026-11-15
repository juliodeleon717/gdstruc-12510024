import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayQueue queue = new ArrayQueue(10);

        int rounds = 0;
        int id = 1;
        int turn = 1;

        while (rounds < 10)
        {
            int randomPlayers = rand.nextInt(7) + 1;   // 1 to 7
            System.out.println("=== Turn " + turn + " ===");

            for(int i = 0; i < randomPlayers; i++)
            {
                queue.add(new Player(id, "Player", rand.nextInt(100) + 1)); //rand is just for random level
                //queue.printQueue(); this took me way too long to realize was the problem
                id++;
            }

            if(queue.size() >= 5){
                rounds++;
                System.out.println("\nGame " + rounds + " started with:");
                for (int i = 0; i < 5; i++) {
                   // queue.printQueue();
                    //queue.remove();

                   System.out.println("  " + queue.remove()); //prints what is being removed aka the players being removed from q
                }
            }
            System.out.println("\nPlayers still in queue: " + queue.size());
            queue.printQueue();

            System.out.println("\nPress Enter to end the turn...");
            scanner.nextLine();
            turn++;

        }
    }
}
