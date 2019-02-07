package com.mjax;

public class Node {
    private String value;
    private Node nextNode;

    public Node(String value) {
        this.value = value;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public String getValue() {
        return value;
    }
}
