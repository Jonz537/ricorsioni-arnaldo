public class Main {
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree(BinaryTree.generationNode());

        binaryTree.generateTree();
        binaryTree.printThisTree();
        System.out.println(binaryTree.resolveThisTree());

    }
}
