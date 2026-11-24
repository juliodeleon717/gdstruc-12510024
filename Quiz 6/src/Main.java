public class Main{
    public static void main(String[] args) {

    Tree tree = new Tree();

    tree.insert(67);
    tree.insert(20);
    tree.insert(40);
    tree.insert(200);
    tree.insert(71);
    tree.insert(90);


    //tree.traverseInOrder();

        System.out.println(tree.get(67));

        System.out.println(tree.getMin());

        System.out.println(tree.getMax());

        tree.traverseInOrderDescending();
    }
}
