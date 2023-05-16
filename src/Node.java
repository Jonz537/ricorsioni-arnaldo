public class Node {

    private Object value;
    private Node firstSon;
    private Node secondSon;

    public Node(Object value) {
        this.value = value;
        firstSon = null;
        secondSon = null;
    }

    public Node(Object value, Node firstSon, Node secondSon) {
        this.value = value;
        this.firstSon = firstSon;
        this.secondSon = secondSon;
    }

    public boolean isChildless() {
        return (firstSon == null && secondSon == null);
    }


    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
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
