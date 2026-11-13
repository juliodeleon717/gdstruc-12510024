
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
public class Main{

    public static void main(String[] args){

        List<Player> playerList = new ArrayList<>(100);

        Player habghia =(new Player( 1, "habghia", 100));
        Player sigma =(new Player( 2, "sigma", 12));
        Player h =(new Player( 3, "h", 1));

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();
        playerLinkedList.addtoFront(habghia);
        playerLinkedList.addtoFront(sigma);
        playerLinkedList.addtoFront(h);

        playerLinkedList.printList();
        //Remove Front Function
        playerLinkedList.removeFront();
        playerLinkedList.printList();

        //linked list size
        int listSize = playerLinkedList.getSize();
        System.out.println("Linked List has " + listSize + " Elements");

        //index finder and doescontain
        System.out.println(playerLinkedList.findIndex(h));        // already removed so negative 1
        System.out.println(playerLinkedList.findIndex(sigma));
        System.out.println(playerLinkedList.findIndex(habghia));
        System.out.println(playerLinkedList.doesContain(sigma));
    }

}
