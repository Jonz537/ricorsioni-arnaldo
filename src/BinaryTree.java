import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.Random;

public class BinaryTree {

    private Node root;
    private static final Random random = new Random();
    private static StringBuilder stringBuilder = new StringBuilder();
    private static char[] ops = new char[]{'+', '-', '*', '/'};

    public BinaryTree(int value) {
        root = new Node(value);
    }

    public BinaryTree(char value) {
        root = new Node(value);
    }

    public BinaryTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void printThisTree() {
        printTree(root);
    }

    public static void printTree(Node node) {
        System.out.println(stringBuilder.toString() + node.getValue());

        if (node.getFirstSon() != null) {
            printTree(node.getFirstSon());
        }
        if (node.getSecondSon() != null) {
            stringBuilder.append("\t");
            printTree(node.getSecondSon());
        }
    }

    public void generateTree() {
        this.root = generationNode();
    }

    public static Node generationNode() {
        if (random.nextInt(0, 101) > 45) {
            return new Node<>(ops[random.nextInt(0, 3)], generationNode(), generationNode());
        }
        return new Node<>(random.nextInt(0, 5));
    }

    public int resolveThisTree() {
        return resolveTree(root);
    }

    public static int resolveTree(Node node) {
        if (node.isChildless()) {
            return (int) node.getValue();
        }
        if ( (char) node.getValue() == '+') {
            return (resolveTree(node.getFirstSon()) + resolveTree(node.getSecondSon()));
        } else if ( (char) node.getValue() == '-') {
            return (resolveTree(node.getFirstSon()) - resolveTree(node.getSecondSon()));
        } else if ( (char) node.getValue() == '*') {
            return (resolveTree(node.getFirstSon()) * resolveTree(node.getSecondSon()));
        } else if ( (char) node.getValue() == '/') {
            return (resolveTree(node.getFirstSon()) / resolveTree(node.getSecondSon()));
        }
        return 0;
    }
}