public class Node<T> {

    private T value;
    private Node firstSon;
    private Node secondSon;

    public Node(T value) {
        this.value = value;
        firstSon = null;
        secondSon = null;
    }

    public Node(T value, Node firstSon, Node secondSon) {
        this.value = value;
        this.firstSon = firstSon;
        this.secondSon = secondSon;
    }

    public boolean isChildless() {
        return (firstSon == null && secondSon == null);
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getFirstSon() {
        return firstSon;
    }

    public void setFirstSon(Node firstSon) {
        this.firstSon = firstSon;
    }

    public Node getSecondSon() {
        return secondSon;
    }

    public void setSecondSon(Node secondSon) {
        this.secondSon = secondSon;
    }
}
