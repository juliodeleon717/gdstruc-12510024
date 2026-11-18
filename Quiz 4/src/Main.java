
public class Main{
    public static void main(String[] args) {

        Player ahbeihyabeng = new Player(1, "ahbeihyabeng", 100);
        Player sigma = new Player( 2, "sigma", 12);
        Player h = new Player( 3, "h", 1);
        Player skibidi = new Player(4, "skibidi", 67);
        Player goat = new Player(5, "goat", 67);
        Player b = new Player( 3, "b", 1);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(sigma.getUserName(), sigma);
        hashtable.put(ahbeihyabeng.getUserName(), ahbeihyabeng);
        hashtable.put(h.getUserName(), h);
        hashtable.put(skibidi.getUserName(), skibidi);
        hashtable.put(goat.getUserName(), goat );
        hashtable.put(b.getUserName(), b);
        hashtable.printHashtable();

        System.out.println(hashtable.get("b")); //stuff is not visible till hashtableget

        System.out.println("Removed: " + hashtable.remove("h"));   
        System.out.println("get h: " + hashtable.get("h"));
        System.out.println("get b: " + hashtable.get("b"));

        System.out.println("Removed missing: " + hashtable.remove("nobody"));  // null

        System.out.println();
        hashtable.printHashtable();
    }
    }
