public class Tester {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(40);
        tree.insert(20);
        tree.insert(50);
        tree.insert(10);        
        tree.insert(30);
        tree.insert(60);        
        tree.insert(5);        
        tree.insert(67);
        tree.insert(78);
        
        System.out.println(tree.find(78));
        
        
          tree.inOrder();
          System.out.println();
          tree.preOrder();
          System.out.println();
          tree.postOrder();

    }

}