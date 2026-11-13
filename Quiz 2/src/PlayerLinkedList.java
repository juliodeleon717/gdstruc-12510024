public class PlayerLinkedList {
    private PlayerNode head;
    private int size;
    public int getSize() {
        return size;
    }

    public void addtoFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size++;
    }
    public Player removeFront(){
        if (head == null){
            return null;
        }
        Player toRemove = head.getPlayer();
        //Moves head to the next player, Java automatically gets rid of the initial head by itself
        head = head.getNextPlayer();
        size--;
        return toRemove;
    }
    public void printList(){
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null){
//            System.out.print(current);
//            System.out.print(" -> ");
//            current = current.getNextPlayer();
            System.out.println("  -> " + current.getPlayer());
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }
    public int findIndex(Player player)
    {
        PlayerNode current = head;
        int index = 0;
        while (current != null){
            if (current.getPlayer().equals(player)){
                return index;  //loop finds it, returns the current index of whatever was called
            }
            current = current.getNextPlayer();
            index++;
        }
        return -1; //returns if the loop didnt find anything, helps determine also if something isnt in it
    }
    public boolean doesContain(Player player){
        return findIndex(player) != -1; //returns true if value given by findindex isnt -1,
    }
}
